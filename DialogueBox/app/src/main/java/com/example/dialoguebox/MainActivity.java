package com.example.dialoguebox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String [] Flowers ={"Rose","Jasmine","SunFlower","Black Rose"};
    ArrayList<Integer> selectedItems;

    Button button;
    Button button2;
    Button button3,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.exit);
        button2=findViewById(R.id.btn_click);
        button3=findViewById(R.id.check);
        button4=findViewById(R.id.customDialogue);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                selectedItems = new ArrayList();
                builder.setTitle("Select Flowers")
                        .setMultiChoiceItems(Flowers,null,((dialog, which, isChecked) -> {
                            if(isChecked){
                                selectedItems.add(which);

                            }
                            else if(selectedItems.contains(which)){
                                selectedItems.remove(Integer.valueOf(which));
                            }
                        }))
                        .setCancelable(false)
                        .setPositiveButton("Yes",((dialog, which) -> {
                            String ms ="";
                            for (int i=0;i<selectedItems.size();i++){
                                ms=ms+"\n"+(i+1)+":"+Flowers[selectedItems.get(i)];
                            }
                            Toast.makeText(getApplicationContext(), "Total"+selectedItems.size()+ms,Toast.LENGTH_LONG).show();
                        }))
                        .setNegativeButton("No",((dialog, which) -> {
                            Toast.makeText(MainActivity.this, "No option Selected", Toast.LENGTH_SHORT).show();
                        }));
                AlertDialog alertDialog=builder.create();
                alertDialog.show();


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Set Flower")
                        .setItems(Flowers,(dialog, which) -> {
                            Toast.makeText(MainActivity.this,Flowers[which], Toast.LENGTH_SHORT).show();
                        });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setIcon(R.drawable.ic_baseline_warning_24)
                        .setTitle("Exit")
                        .setMessage("Are you sure you want to exit the app")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        })
                        .setNeutralButton("Help", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //Toast.makeText(MainActivity.this,"Press Yes to Exit app",Toast.LENGTH_LONG).show();
                                Toast.makeText(MainActivity.this, "Press Yes to Exit app", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();

                            }
                        }).show();
            }
        });

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(MainActivity.this)
                .setIcon(R.drawable.ic_baseline_warning_24)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit the app")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                })
                .setNeutralButton("Help", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Press Yes to Exit app", Toast.LENGTH_SHORT).show();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                }).show();
    }

    public void Move(View view) {
        Intent intent= new Intent(this,CustomDialogue.class);
        startActivity(intent);
    }
}
