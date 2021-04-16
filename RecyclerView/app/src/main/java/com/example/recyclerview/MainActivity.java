package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();

    }



    private void initData() {

        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.b,"Hira","11:00 Pm","Assalam","____________________________________________"));
        userList.add(new ModelClass(R.drawable.c,"Tahira","9:00 Am","Assign Task","____________________________________________"));
        userList.add(new ModelClass(R.drawable.d,"Momina","10:00 Pm","Clear","____________________________________________"));
        userList.add(new ModelClass(R.drawable.a,"Komal","4:00 Pm","ok","____________________________________________"));



    }
    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

}