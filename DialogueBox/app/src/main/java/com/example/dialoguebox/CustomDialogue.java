package com.example.dialoguebox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CustomDialogue extends AppCompatActivity implements ExampleDialogue.ExampleDialogueListner {
TextView UName;
    TextView UPWD;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialogue);
        UName=findViewById(R.id.userName);
        UPWD=findViewById(R.id.userPassword);
        btn=findViewById(R.id.customBTN);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogue();
            }
        });

    }

    private void openDialogue() {
        ExampleDialogue exampleDialogue =new ExampleDialogue();
        exampleDialogue.show(getSupportFragmentManager(),"example dialogue");
    }

    @Override
    public void applyTests(String uname, String pwd) {
        UName.setText(uname);
        UPWD.setText(pwd);
    }
}