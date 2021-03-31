package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC2", "onStart called");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC2", "onPause called");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC2", "onDestroy called");

    }
    ListView listView;
    ArrayList<String> flowersList;
    ArrayAdapter<String> arrayAdapter;
    TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView =findViewById(R.id.myListView);
        editText=findViewById(R.id.textInputEditText);
       flowersList=new ArrayList<String>();
        flowersList.add("rose");
        flowersList.add("sun flower");
        flowersList.add("jasmine");
         arrayAdapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,flowersList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Log.d("you clicked",flowersList.get(i));
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("flower",flowersList.get(i));
                startActivity(intent);
            }
        });
        
    }
    public  void  Addfriend(View view)
    {
        flowersList.add(editText.getText().toString());
        listView.setAdapter(arrayAdapter);
        Collections.sort(flowersList);
        
    }

    public void Move(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}