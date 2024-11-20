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
    private String welcomeMSG, prisionerName;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Retrieve the user's name from the Intent
        prisionerName = getIntent().getStringExtra("User's Name");

        // Ensure that the name is valid (not null or empty)
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
                items.add(0, "paperclip");
                Log.d("Adding", items.get(0));
                paperclip.setVisibility(View.GONE);  // Hide the paperclip button after clicking
            }
        });

        // Handle stayCell button listener (changes based on captureNumber)
        stayCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (captureNumber == 1) {
                    setupUI();  // Update the message based on captureNumber
                    captureNumber = 2;
                } else if (captureNumber == 2) {
                    setupUI();  // Update the message based on captureNumber
                    captureNumber = 3;
                }
            }
        });

        // Handle leaveCell button listener (only active for captureNumber 3)
        leaveCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.add(9, prisionerName);
                Log.d("Capture", "Current captureNumber: " + captureNumber);

                if (captureNumber < 3) {
                    // Navigate to ThirdActivity
                    Log.d("ActivityLaunch", "Going to ThirdActivity");
                    Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);  // Optional: Clears previous activities from back stack
                    startActivity(i);
                } else if (captureNumber == 3) {
                    // Navigate to CaptureActivity
                    Log.d("ActivityLaunch", "Going to CaptureActivity");
                    Intent i = new Intent(SecondActivity.this, CaptureActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}




