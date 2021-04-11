package com.example.lec6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Table(View view) {
        Intent intent =new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void Animation(View view) {
        Intent intent =new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}