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


public class ThirdActivity extends AppCompatActivity {

    private TextView messageTXT;
    private Button leftOfCell, rightOfCell;
    private int captureNumber = 0;





    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        rightOfCell = findViewById(R.id.rightBTN);
        leftOfCell = findViewById(R.id.leftBTN);


    }
}



