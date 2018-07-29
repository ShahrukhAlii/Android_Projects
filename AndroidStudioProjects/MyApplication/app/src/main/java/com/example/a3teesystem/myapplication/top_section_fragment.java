package com.example.a3teesystem.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.JarEntry;

public class top_section_fragment  extends Fragment {


    private static EditText topTextInput;
    private static EditText bottomTextInput;


    topSectionListner activityCommander;


    public interface topSectionListner {

        public void createMeme(String top, String bottom);


    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {

            activityCommander =(topSectionListner)activity;


        }
        catch (ClassCastException e){

           throw  new ClassCastException(activity.toString());

        }

    }







    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment , container ,false);


        topTextInput =(EditText)view.findViewById(R.id.topTextInput);
        bottomTextInput=(EditText)view.findViewById(R.id.bottomTextInput);
        final  Button button = (Button)view.findViewById(R.id.Button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });



        return view;




    }
    public void buttonClicked(View v){
activityCommander.createMeme(topTextInput.getText().toString(),   bottomTextInput.getText().toString());




    }
}
