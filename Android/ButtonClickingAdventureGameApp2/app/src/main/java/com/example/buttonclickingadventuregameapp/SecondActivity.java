package com.example.buttonclickingadventuregameapp;

import static com.example.buttonclickingadventuregameapp.MainActivity.items;

import  android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class SecondActivity extends AppCompatActivity {

    private TextView messageTXT;
    private Button leaveCell, stayCell;
    private ImageButton paperclip;
    private int captureNumber = 0;
    private String welcomeMSG;
    private final String prisionerName = getIntent().getStringExtra("User's Name");


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        leaveCell = findViewById(R.id.leaveCellBTN);
        stayCell = findViewById(R.id.stayCellBTN);
        paperclip = findViewById(R.id.paperClipBTN);
        messageTXT = findViewById(R.id.helloTXT);
        if (captureNumber == 0) {
            String welcomeMSG = ("Hello, " + prisionerName + " this is your prison cell!");
            messageTXT.setText(welcomeMSG);
            captureNumber = 1;
            paperclip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    items.add(0,"PaperClip");
                    Log.d("Adding", items.get(0));
                }
            });

            }
        if (captureNumber == 1) {
            stayCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    welcomeMSG = "Hey, " + prisionerName + " you may want to leave your cell!";
                    messageTXT.setText(welcomeMSG);
                    captureNumber = 2;


                }
            });
        }
        if (captureNumber == 2){
            paperclip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    items.add(0,"PaperClip");
                    Log.d("Adding", items.get(0));
                }
            });
            stayCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    captureNumber = 3;
                }
            });
        }
        if (captureNumber == 3){
            paperclip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    items.add(0,"PaperClip");
                    Log.d("Adding", items.get(0));
                }
            });
            leaveCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(SecondActivity.this, CaptureActivity.class);

                }
            });
        }


    }
}
