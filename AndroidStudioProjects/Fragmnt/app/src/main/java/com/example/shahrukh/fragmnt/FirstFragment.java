package com.example.shahrukh.fragmnt;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FirstFragment extends Fragment {

View view;
Button firstFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, final Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.activity_first_fragment,container,false);
        firstFragment=(Button)view.findViewById(R.id.firstfragment);
        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"First Fragment",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
