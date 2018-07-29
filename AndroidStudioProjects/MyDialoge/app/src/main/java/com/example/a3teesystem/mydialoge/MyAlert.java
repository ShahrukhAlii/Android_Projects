package com.example.a3teesystem.mydialoge;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MyAlert  extends DialogFragment{


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
            //super.onCreateDialog(savedInstanceState);


       AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

       builder.setTitle("My Dialog");

       //for singel item
      // builder.setMessage("Do you like the Dialog");

        //for several items
      //  builder.setItems(R.array.days, new DialogInterface.OnClickListener() {
        //    @Override
          //  public void onClick(DialogInterface dialog, int which) {


//                Toast.makeText(getActivity(),"The multiple button was clicked"+which,Toast.LENGTH_SHORT).show();
  //          }
    //    });

        //for multiple items
        builder.setMultiChoiceItems(R.array.days, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                Toast.makeText(getActivity(),"The multiple button was clicked"+isChecked,Toast.LENGTH_SHORT).show();
            }
        });
       builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {

               Toast.makeText(getActivity(),"the negative button was clicked",Toast.LENGTH_SHORT).show();
           }
       });
       builder.setPositiveButton(R.string.Ok, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {

               Toast.makeText(getActivity(),"the Postive button was clicked",Toast.LENGTH_SHORT).show();
           }
       });
       Dialog dialog=builder.create();
        return dialog;
    }


}
