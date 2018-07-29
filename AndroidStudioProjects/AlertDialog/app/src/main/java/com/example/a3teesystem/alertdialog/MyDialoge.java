package com.example.a3teesystem.alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;


public class MyDialoge extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("My messgae");
      //  builder.setMessage("This is new Dialog");
        builder.setItems(R.array.months, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getActivity()," New Button was clicked"+which,Toast.LENGTH_LONG).show();

            }
        });

        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getActivity(),"Button was clicked from Negative side"+which,Toast.LENGTH_LONG).show();
            }
        });
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getActivity(),"Button was clicked from Negative side"+which,Toast.LENGTH_LONG).show();

            }
        });

        Dialog dialog=builder.create();

        return dialog;
    }
}
