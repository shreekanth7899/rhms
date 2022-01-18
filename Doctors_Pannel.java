package com.example.rhms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctors_Pannel extends AppCompatActivity {
    public Button patient_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_pannel);

        patient_details = findViewById(R.id.btnView);

        patient_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doctors_Pannel.this,patient_Pannel.class);
                startActivity(intent);

            }
        });
    }
}