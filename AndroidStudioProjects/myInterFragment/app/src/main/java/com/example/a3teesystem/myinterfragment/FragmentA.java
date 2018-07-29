package com.example.a3teesystem.myinterfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class FragmentA extends Fragment implements View.OnClickListener{

   Button button;
   int counter=0;
   Communiactor comm;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        comm=(Communiactor)getActivity();
        super.onActivityCreated(savedInstanceState);
        button=(Button) getActivity().findViewById(R.id.button);
    }

    @Override
    public void onClick(View v) {
        counter++;
        comm.respond("Text is count "+counter+" ");
    }

}
