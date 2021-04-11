package com.example.lec6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView=findViewById(R.id.Listview);
        SeekBar seekBar=findViewById(R.id.seekBar);
        seekBar.setMax(20);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int index, boolean fromUser) {
                //Log.i("Seekbar Value is",String.valueOf(index));
                int tableNum=index;
                ArrayList<String> table =new ArrayList<String>();
                for (int i=1;i<11;i++)
                {
                    table.add((Integer.toString(i*index)));
                }
                ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,table);
                listView.setAdapter(arrayAdapter);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}