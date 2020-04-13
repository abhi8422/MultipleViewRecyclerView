package com.example.multipleviewrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList<Model> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        list.add(new Model("","12/3/20","","Date"));
        list.add(new Model("Abhi","12/3/20","hello abhi","Desc"));
        list.add(new Model("","13/3/20","","Date"));
        list.add(new Model("Abhi","13/3/20","hello abhi","Desc"));
        list.add(new Model("Abhi","13/3/20","hello abhi","Desc"));
        list.add(new Model("Abhi","13/3/20","hello abhi","Desc"));
        list.add(new Model("","14/3/20","","Date"));
        list.add(new Model("Abhi","14/3/20","hello abhi","Desc"));
        list.add(new Model("Abhi","14/3/20","hello abhi","Desc"));
        list.add(new Model("Abhi","14/3/20","hello abhi","Desc"));
        list.add(new Model("Abhi","14/3/20","hello abhi","Desc"));
        list.add(new Model("","15/3/20","","Date"));
        list.add(new Model("Abhi","15/3/20","hello abhi","Desc"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerAdapter(list));
    }
}
