package com.example.shahrukh.fragment;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SecondFragmentActivity extends Fragment {
    Button butt2;
    View view;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        view=inflater.inflate(R.layout.activity_second_fragment,container,false);
butt2=(Button)view.findViewById(R.id.secondButton);
butt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(),"This is Second Activity",Toast.LENGTH_LONG).show();
    }
});
return view;

    }
}

