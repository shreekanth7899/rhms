package com.example.rhms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btnOne;
    public Button btnTwo;
    public Button btnThree;

    public void init(){
        btnOne = (Button) findViewById(R.id.ptbtnOne);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        btnOne.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(MainActivity.this,second.class);
                    startActivity(intent);
            }
        });
        }
    }

    public void seit(){
        btnTwo = (Button) findViewById(R.id.ptbtnTwo);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent patient = new Intent(MainActivity.this,patient.class);
                startActivity(patient);
            }
        });
    }

    public void geit(){
        btnThree = (Button) findViewById(R.id.ptbtnThree);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registration = new Intent(MainActivity.this,registration.class);
                    startActivity(registration);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        seit();
        geit();
    }
}