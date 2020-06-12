package com.rohan.EventCalender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class student_login extends AppCompatActivity {
    Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from signup.xml
        setContentView(R.layout.student_login);

        // Locate the button in activity_main.xml
        button1 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Coming Soon", Toast.LENGTH_SHORT).show();
/*
                // Start stud_signup.class
                Intent myIntent = new Intent(student_login.this,
                        stud_main1.class);
                startActivity(myIntent); */
            }
        });
    }
}