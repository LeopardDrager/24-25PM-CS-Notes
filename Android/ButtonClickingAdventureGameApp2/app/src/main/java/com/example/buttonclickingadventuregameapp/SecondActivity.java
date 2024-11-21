package com.example.buttonclickingadventuregameapp;

import static com.example.buttonclickingadventuregameapp.MainActivity.items;

import  android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
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
    private String prisionerName;




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Initialize the list to ensure it has at least 6 elements
        for (int i = items.size(); i < 6; i++) {
            items.add("");  // Add empty strings to avoid out-of-bounds issues
        }


        // Retrieve the user's name from the Intent
        prisionerName = getIntent().getStringExtra("User's Name");
        if (prisionerName == null || prisionerName.isEmpty()) {
            prisionerName = "Unknown Prisoner";  // Fallback value
        }

        // Initialize the views
        leaveCell = findViewById(R.id.leaveCellBTN);
        stayCell = findViewById(R.id.stayCellBTN);
        paperclip = findViewById(R.id.paperClipBTN);
        messageTXT = findViewById(R.id.helloTXT);

        // Set up the initial message and buttons based on captureNumber
        setupUI();

        // Set up the button listeners for all possible states
        setUpButtonListeners();
    }

    private void setupUI() {
        String welcomeMSG;
        if (captureNumber == 0) {
            welcomeMSG = "Hello, " + prisionerName + ", this is your prison cell!";
            messageTXT.setText(welcomeMSG);
            captureNumber = 1;
        } else if (captureNumber == 1) {
            welcomeMSG = "Hey, " + prisionerName + " you may want to leave your cell!";
            messageTXT.setText(welcomeMSG);
        }
    }


    private void setUpButtonListeners() {

        paperclip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.set(0, "paperclip");
                paperclip.setVisibility(View.GONE);  // I found this on some random stack overflow link at night and lost the link
            }
        });


        stayCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (captureNumber == 1) {
                    setupUI();  // Update the message based on captureNumber
                    captureNumber = 2;
                }else if (captureNumber == 2) {
                    // Update the message based on captureNumber
                    captureNumber = 3;
                }
            }
        });

        leaveCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (captureNumber < 3) {
                    if (items.get(0).isEmpty()) {
                        items.add(0, "false");
                    }
                    items.add(1, prisionerName);
                    Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                    startActivity(i);
                }else if (captureNumber == 3) {
                    items.add(1, prisionerName);
                    Intent i = new Intent(SecondActivity.this, CaptureActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}




