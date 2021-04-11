package com.example.lec6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView imageView = findViewById(R.id.imageView);
        //imageView.animate().alpha(0).setDuration(2000);
        //imageView.animate().translationXBy(-500).setDuration(2000);
        //imageView.animate().rotation(720).setDuration(2000);
        //imageView.animate().rotation(720).alpha(0).setDuration(2000);
       // imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(2000);


    }
}