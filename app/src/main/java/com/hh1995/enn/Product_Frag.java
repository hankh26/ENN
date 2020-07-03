package com.hh1995.enn;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Product_Frag extends Fragment {

    ArrayList<Item> items=new ArrayList<>();
    ItemAdapter adapter;
    RecyclerView recyclerView;
    RecyclerView recyclerView2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_product,container,false);


        items.add(new Item(R.drawable.en1,"이름","가격"));
        items.add(new Item(R.drawable.en2,"이름","가격"));
        items.add(new Item(R.drawable.en3,"이름","가격"));
        items.add(new Item(R.drawable.en4,"이름","가격"));
        items.add(new Item(R.drawable.en5,"이름","가격"));
        items.add(new Item(R.drawable.en6,"이름","가격"));
        items.add(new Item(R.drawable.en7,"이름","가격"));
        items.add(new Item(R.drawable.en8,"이름","가격"));
        items.add(new Item(R.drawable.en9,"이름","가격"));
        items.add(new Item(R.drawable.en10,"이름","가격"));


        recyclerView=view.findViewById(R.id.recycler);
        adapter=new ItemAdapter(items, getActivity());
        recyclerView.setAdapter(adapter);

        recyclerView2=view.findViewById(R.id.recycler2);
        recyclerView2.setAdapter(adapter);

        return view;
    }
}
