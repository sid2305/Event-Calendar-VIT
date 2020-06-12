package com.rohan.EventCalender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class chapter_login extends AppCompatActivity {
    Button b1;
    EditText ed1, ed2;

    TextView tx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter_login);

        b1 = (Button) findViewById(R.id.button2);
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);

        //b2 = (Button) findViewById(R.id.button2);
        tx1 = (TextView) findViewById(R.id.textView3);
//        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("codechef") &&
                        ed2.getText().toString().equals("9999444057")) {
                    Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(chapter_login.this, chapter_loginopt.class);
                    startActivity(myIntent);
                }else
                if (ed1.getText().toString().equals("spartans") &&
                        ed2.getText().toString().equals("9943788852")) {
                    Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(chapter_login.this, chapter_loginopt.class);
                    startActivity(myIntent);
                }else
                if (ed1.getText().toString().equals("spartans") &&
                        ed2.getText().toString().equals("9952664055")) {
                    Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(chapter_login.this, chapter_loginopt.class);
                    startActivity(myIntent);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
                }
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