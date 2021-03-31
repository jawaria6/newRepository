package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  Button button1;
    Button button2;
    Button button3;
  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button1 = findViewById(R.id.button4);
        button2 = findViewById(R.id.button5);
        button3 = findViewById(R.id.button2);
         textView=findViewById(R.id.textViewcode);

    }

    public void SomeOneIsThere(View view) {

        textView.setText("some one is there");
    }

    public void FlowerWebSite(View view) {
        Uri uri=Uri.parse("https://www.google.com/search?source=univ&tbm=isch&q=flower&sa=X&ved=2ahUKEwj9lOfAgrDvAhV5SBUIHXnxDzMQjJkEegQIARAB");
        Intent intent =new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public void AnimalsWebsite(View view) {
        Uri uri=Uri.parse("https://www.google.com/search?q=animal&tbm=isch&chips=q:animal,g_1:baby:zfZEAYWQag8%3D&bih=608&biw=982&hl=en&sa=X&ved=2ahUKEwjog9zbgrDvAhUL8RoKHU5-C-0Q4lYoAHoECAEQGA");
        Intent intent =new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }
}