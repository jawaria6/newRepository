package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC3", "onStart called");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC3", "onPause called");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC3", "onDestroy called");

    }
TextView textView;
SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView=findViewById(R.id.textView3);
        Intent intent =getIntent();
        intent.getStringExtra("flower");
        Log.d("check",intent.getStringExtra("flower"));
        textView.setText(intent.getStringExtra("flower"));


    }
}