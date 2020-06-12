package com.rohan.EventCalender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_main, container, false);

        Button chap_log = (Button)v.findViewById(R.id.button);
        chap_log.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), chapter_login.class);
                startActivity(intent);
            }
        });

        // Locate the button in activity_main.xml
        Button stud_log = (Button)v.findViewById(R.id.button5);

        // Capture button clicks
        stud_log.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Wait for It", Toast.LENGTH_SHORT).show();
                   /* Intent intent = new Intent(getActivity(), chapter_login.class);
                    startActivity(intent); */
                }
            });

        // Locate the button in activity_main.xml
        Button signup = (Button)v.findViewById(R.id.signup);

        // Capture button clicks
        signup.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
                Toast.makeText(getContext(), "Network Connection Required!", Toast.LENGTH_SHORT).show();

                /*Intent myIntent = new Intent(getActivity(), signup.class);
                startActivity(myIntent); */
            }
        });
        return v;
    }

}
