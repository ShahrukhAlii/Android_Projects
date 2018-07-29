package com.example.shahrukh.fragment1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;



public class firstFragment extends Fragment {

    View view;
    Button firstButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        firstButton=(Button)view.findViewById(R.id.firstbutton);
        view=inflater.inflate(R.layout.first_layout,container,false);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"First Fragment",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
