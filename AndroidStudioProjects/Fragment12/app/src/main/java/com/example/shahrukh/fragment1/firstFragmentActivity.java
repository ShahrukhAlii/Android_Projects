package com.example.shahrukh.fragment1;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class firstFragmentActivity extends Fragment{


    View view;
    Button firstFragment;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


      view=inflater.inflate(R.layout.activity_first_fragment,container,false);
      firstFragment=(Button)view.findViewById(R.id.button3);
      firstFragment.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             Toast.makeText(getActivity(),"This is first Fragment", Toast.LENGTH_LONG).show();

          }
      });

return view;
    }
}

