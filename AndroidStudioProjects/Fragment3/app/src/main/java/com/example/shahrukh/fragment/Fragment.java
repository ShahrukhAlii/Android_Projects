package com.example.shahrukh.fragment;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment extends android.app.Fragment {

    View view;
    Button FirstButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        view=inflater.inflate(R.layout.activity_fragment,container,false);
        FirstButton=(Button)view.findViewById(R.id.button2);
        FirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Fragment",Toast.LENGTH_LONG).show();
            }
        });


        return view;
    }
}
