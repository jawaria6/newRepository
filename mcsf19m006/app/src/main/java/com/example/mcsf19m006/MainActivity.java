package com.example.mcsf19m006;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button4);
        button2 = findViewById(R.id.button2);
    }

   public void call(View view){
       Uri uri=Uri.parse("tel:+92334567899");
       Intent intent =new Intent(Intent.ACTION_DIAL,uri);
       startActivity(intent);
   }
    public void ShWebsiteow(View view){
        Uri uri=Uri.parse("http://www.pucit.edu.pk");
        Intent intent =new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}