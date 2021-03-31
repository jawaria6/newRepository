package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
TextView textView;
int count=0;


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC", "onStart called");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC", "onPause called");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC", "onDestroy called");

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value",count);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView2);
        Log.d("ALC", "onCreate called");
        if(savedInstanceState!=null)
        {
           count= savedInstanceState.getInt("value");
            textView.setText(String.valueOf(count));
        }

    }

    public void IncreaseNumber(View view) {
        count=Integer.parseInt(textView.getText().toString());
        count++;
        textView.setText(String.valueOf(count));
    }

    public void Main2Activity(View view) {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void Main3Activity(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}