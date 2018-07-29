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


public class bottomSectionFragment extends Fragment{


    private static EditText topMemeText;
    private  static  EditText bottomMemeText;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.bottom_section_fragmant,container,false);
        topMemeText =(EditText)view.findViewById(R.id.topTextInput);
        bottomMemeText=(EditText)view.findViewById(R.id.bottomTextInput);
        return view;
    }


    public void setTopMemeText (String top,String bottom){


    topMemeText.setText(top);
    bottomMemeText.setText(bottom);

    }

}
