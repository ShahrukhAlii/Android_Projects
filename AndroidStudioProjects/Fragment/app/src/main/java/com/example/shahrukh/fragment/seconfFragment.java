package com.example.shahrukh.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;



public class seconfFragment extends Fragment {

    View view;
    Button secondButton;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.second_layoyt,container,false);
        secondButton=(Button) view.findViewById(R.id.second_fragment);
        secondButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Second Frangemt",Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }
}
