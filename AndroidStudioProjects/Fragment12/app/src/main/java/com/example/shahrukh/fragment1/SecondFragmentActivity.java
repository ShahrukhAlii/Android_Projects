package com.example.shahrukh.fragment1;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SecondFragmentActivity extends Fragment {
     Button secondFragment;
     View view;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_second_fragment,container,false);
        secondFragment=(Button) view.findViewById(R.id.button4);
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"This is Second Fragment", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}

