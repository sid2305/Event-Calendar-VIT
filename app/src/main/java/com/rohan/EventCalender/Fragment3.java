package com.rohan.EventCalender;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Fragment3 extends Fragment {


    private View v;

    public Fragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.clubsnchapters, container, false);
        configureImageButton();
        return v;
    }

    private void configureImageButton() {
        ImageButton btn1 = (ImageButton) v.findViewById(R.id.imageButton1);
        ImageButton btn2 = (ImageButton) v.findViewById(R.id.imageButton2);
        ImageButton btn3 = (ImageButton) v.findViewById(R.id.imageButton3);
        ImageButton btn4 = (ImageButton) v.findViewById(R.id.imageButton6);


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getActivity(), codechef.class);
                startActivity(mIntent);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getActivity(), spartans.class);
                startActivity(mIntent);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getActivity(), csi.class);
                startActivity(mIntent);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getActivity(), ieee.class);
                startActivity(mIntent);

            }
        });


    }
}
