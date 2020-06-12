package com.rohan.EventCalender;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    Button button1;
    Button button2;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from signup.xml
        setContentView(R.layout.signup);

        // Locate the button in activity_main.xml
        button1 = (Button) findViewById(R.id.student_sign_up);
        button2 = (Button) findViewById(R.id.chapter_sign_up);


        // Capture button1 clicks
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Coming Soon", Toast.LENGTH_SHORT).show();
                // Start stud_signup.class
    /*            Intent myIntent = new Intent(signup.this,
                        stud_signup.class);
                startActivity(myIntent); */
            }
        });
        // Capture button2 clicks
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Coming Soon", Toast.LENGTH_SHORT).show();
                // Start chapter_signup.class
/*                Intent myIntent = new Intent(signup.this,
                        chapter_signup.class);
                startActivity(myIntent); */
            }
        });
    }


}
