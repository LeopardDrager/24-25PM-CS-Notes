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


public class FourthActivity extends AppCompatActivity {

    private TextView messageTXT;
    private Button forwardBTN, backwardBTN;
    private int captureNumber = 0;





    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        forwardBTN = findViewById(R.id.forwardBTN);
        backwardBTN = findViewById(R.id.backwardBTN);

        backwardBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (FourthActivity.this, CaptureActivity.class);
                startActivity(i);
            }

        });
        forwardBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourthActivity.this, FithActivity.class);
                startActivity(i);
            }
        });




    }
}



