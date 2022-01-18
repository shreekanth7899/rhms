package com.example.rhms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registration extends AppCompatActivity {

    private EditText regUsername, regMobileno, regEmail, regPassword, regConfPassword ;
    public Button regSignup;
    private FirebaseAuth fAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        regUsername = findViewById(R.id.Username);
        regMobileno = findViewById(R.id.phoneno);
        regEmail = findViewById(R.id.emailReg);
        regPassword = findViewById(R.id.etRegpass);
        regConfPassword = findViewById(R.id.etRegPassC);
        regSignup = findViewById(R.id.btnSignup);
        fAuth = FirebaseAuth.getInstance();

        //if (fAuth.getCurrentUser() != null){
            //startActivity(new Intent(registration.this, MainActivity.class));
            //finish();
       // }

        regSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = regUsername.getText().toString().trim();
                String Password = regPassword.getText().toString().trim();
                String ConformPassword = regConfPassword.getText().toString().trim();
                String Mobile_No = regMobileno.getText().toString().trim();
                String Email = regEmail.getText().toString().trim();

                if (TextUtils.isEmpty(Username)) {
                    regUsername.setError("Enter User Name");
                    return;
                }

                if (TextUtils.isEmpty(Mobile_No)) {
                    regMobileno.setError("Please Enter Mobile Number");
                    return;
                }

                if (TextUtils.isEmpty(Email)) {
                    regEmail.setError("Email is Required");
                    return;

                }

                if (TextUtils.isEmpty(Password)) {
                    regPassword.setError("Password is required");
                    return;
                }

                if (TextUtils.isEmpty(ConformPassword)) {
                    regConfPassword.setError("Please Confirm the Password");
                    return;
                }

                if (Password.length() < 6) {
                    regPassword.setError("Password Must Be >= 6 Characters");
                    return;
                }

                // register user in firebase

                fAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(registration.this, "User Created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        } else {
                            Toast.makeText(registration.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }


                    }
                });

            }
        });
    }

}