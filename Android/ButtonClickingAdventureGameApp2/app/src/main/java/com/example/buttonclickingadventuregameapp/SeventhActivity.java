package com.example.buttonclickingadventuregameapp;

import static com.example.buttonclickingadventuregameapp.MainActivity.items;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SeventhActivity extends AppCompatActivity {

    private Button cutFence, backward;

    private TextView outputTXT;
    private String outputMSG;

    private int temp;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        cutFence = findViewById(R.id.cutTheFenceBTN);
        backward = findViewById(R.id.backwardBTN);
        outputTXT = findViewById(R.id.helloTXT);

        cutFence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(6).equals("boltcutters")){
                    outputMSG = items.get(1) + " you have a good eye!";
                    outputTXT.setText(outputMSG);
                    Intent i = new Intent(SeventhActivity.this, EighthActivity.class);
                    startActivity(i);
                }else if (items.get(6).equals("false")){
                    outputMSG = items.get(1) + " you better go look for it";
                    outputTXT.setText(outputMSG);
                }
            }
        });
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SeventhActivity.this, SixthActivity.class);
                startActivity(i);
            }
        });











    }
}
