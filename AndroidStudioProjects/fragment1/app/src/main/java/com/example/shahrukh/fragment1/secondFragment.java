package com.example.shahrukh.fragment1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by 3tee system on 5/26/2018.
 */

public class secondFragment extends Fragment {

    View view;
    Button secondButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        secondButton=(Button) view.findViewById(R.id.secondfragment);
        view=inflater.inflate(R.layout.second_layout,container,false);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"Second Fragment",Toast.LENGTH_LONG).show();

            }
        });

        return view;
    }
}
