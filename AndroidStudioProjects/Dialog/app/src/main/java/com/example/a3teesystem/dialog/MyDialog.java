package com.example.a3teesystem.dialog;


import android.app.Activity;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MyDialog  extends DialogFragment implements View.OnClickListener{

Button yes,no;
Communicator communicator;


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        communicator= (Communicator) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.my_dialog,null);
        yes=(Button)view.findViewById(R.id.yes);
        no=(Button)view.findViewById(R.id.no);

        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        setCancelable(false);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.yes){

          //  Toast.makeText(getActivity(),"Yes Button was selected",Toast.LENGTH_LONG).show();
            dismiss();
            communicator.DialogMessage("Yes was clicked");

        }
        else{

            //Toast.makeText(getActivity(),"No the button was no selected yet",Toast.LENGTH_LONG).show();
            dismiss();
            communicator.DialogMessage("No was clicked");
        }
    }
    interface Communicator{

        public  void DialogMessage(String message);

    }
}
