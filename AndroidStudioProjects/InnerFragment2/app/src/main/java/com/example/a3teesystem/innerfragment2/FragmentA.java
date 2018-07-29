package com.example.a3teesystem.innerfragment2;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.ListView;

public class FragmentA  extends Fragment implements AdapterView.OnItemClickListener{

ListView listView;
Communicators communicators;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicators=(Communicators)getActivity();
        listView=getActivity().findViewById(R.id.listView);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.titles,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        communicators.respond(position);

    }
}
