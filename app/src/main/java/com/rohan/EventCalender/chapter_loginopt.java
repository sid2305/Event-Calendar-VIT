package com.rohan.EventCalender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class chapter_loginopt extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter_loginopt);

        button1 = (Button) findViewById(R.id.button7);
        button2 = (Button) findViewById(R.id.button8);
        button3 = (Button) findViewById(R.id.button9);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                /*Intent myIntent = new Intent(chapter_loginopt.this,
                        create_event.class);
                startActivity(myIntent); */
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                /*Intent myIntent = new Intent(chapter_loginopt.this,
                        edit_event.class);
                startActivity(myIntent);*/
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                /*Intent myIntent = new Intent(chapter_loginopt.this,
                        delete_event.class);
                startActivity(myIntent);*/
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return super.onOptionsItemSelected(item);
    }
}
