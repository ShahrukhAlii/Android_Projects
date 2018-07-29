package com.example.a3teesystem.flexibleuserinterfacewithfragments;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {
    ListView listView;
    Communicator communicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);


    }

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        listView= getActivity().findViewById(R.id.liastView);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.titles,android.R.layout.simple_list_item_1);

        listView.setAdapter(adapter);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

        communicator.respond(i);

    }
}
