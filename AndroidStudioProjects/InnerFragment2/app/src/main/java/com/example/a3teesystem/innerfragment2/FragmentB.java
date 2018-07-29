package com.example.a3teesystem.innerfragment2;


import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         View view= inflater.inflate(R.layout.fragment_b,container,false);

         return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView=(TextView)getActivity().findViewById(R.id.textView);
    }
    public void ChangeData(int i){

        Resources res=getResources();
        String[] description=res.getStringArray(R.array.descriptions);

        textView.setText(description[i]);
    }
}
