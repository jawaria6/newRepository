package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private  NotificationManagerCompat notificationManager;
EditText editTextTitle;
    EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationManager=NotificationManagerCompat.from(this);
        editTextTitle=findViewById(R.id.edit_text_title);
        editTextMessage=findViewById(R.id.edit_text_message);

    }


    public void sendChannel1(View view) {
        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        Notification notification =new NotificationCompat.Builder(this, App.Channel_1_id)
               .setSmallIcon(R.drawable.ic_baseline_looks_one_24)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManager.notify(1,notification);

    }

    public void sendChannel2(View view) {
        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        Notification notification =new NotificationCompat.Builder(this, App.Channel_2_id)
                .setSmallIcon(R.drawable.ic_baseline_looks_two_24)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .build();
        notificationManager.notify(2,notification);
    }
}
