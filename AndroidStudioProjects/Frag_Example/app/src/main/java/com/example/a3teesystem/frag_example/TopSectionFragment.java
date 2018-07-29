package com.example.a3teesystem.frag_example;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.ExecutionException;


public class TopSectionFragment extends Fragment {


    private static EditText topTextInput;
    private static EditText bottomTextnput;





    topSectionListner activityCommander;
    public interface topSectionListner {

        public void createMeme(String top,String bottom);


    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);


        try {
activityCommander=(topSectionListner)activity;
        }
        catch (ClassCastException e){

            throw  new  ClassCastException(activity.toString());

        }


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.top_section_fragmant ,container,false);

        topTextInput=(EditText)view.findViewById(R.id.topTextInput);
        bottomTextnput=(EditText)view.findViewById(R.id.bottomTextInput);
        final Button button =(Button) view.findViewById(R.id.button);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonClicked(v);

            }
        });


        return view;

    }

public void buttonClicked(View v){

activityCommander.createMeme(topTextInput.getText().toString(),bottomTextnput.getText().toString());


}


}
