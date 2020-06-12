package com.rohan.EventCalender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment4 extends Fragment{

    private View v;
    public Fragment4(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_main, container, false);
        configureButton();
        return v;
    }
    private void configureButton() {
        Button btn1 = (Button)v.findViewById(R.id.button5);
        Button btn2 = (Button)v.findViewById(R.id.button);
        Button btn3 = (Button)v.findViewById(R.id.signup);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Coming Soon", Toast.LENGTH_SHORT).show();
                //Intent mIntent = new Intent(getActivity(), student_login.class);
                //startActivity(mIntent);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getActivity(), chapter_login.class);
                startActivity(mIntent);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                //Intent mIntent = new Intent(getActivity(), signup.class);
                //startActivity(mIntent);

            }
        });

    }
}
