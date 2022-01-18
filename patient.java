package com.example.rhms;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class patient extends AppCompatActivity {
    public EditText Email;
    public EditText Password;
    public Button Signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);

        Email = findViewById(R.id.ptbtnOne);
        Password = findViewById(R.id.ptbtnTwo);
        Signin = findViewById(R.id.ptbtnThree);

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(patient.this,patient_Pannel.class);
                startActivity(intent);
            }
        });
    }
}
