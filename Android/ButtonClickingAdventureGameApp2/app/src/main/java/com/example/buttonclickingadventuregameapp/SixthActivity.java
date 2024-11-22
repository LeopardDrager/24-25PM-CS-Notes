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

public class SixthActivity extends AppCompatActivity {

    private Button forward, backward;
    private ImageButton boltCutters;
    private TextView outputTXT;
    private String outputMSG;

    private int temp;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        boltCutters = findViewById(R.id.boltCuttersBTN);
        forward = findViewById(R.id.forwardBTN);
        backward = findViewById(R.id.backwardBTN);
        outputTXT = findViewById(R.id.helloTXT);

        boltCutters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.set(6, "boltcutters");
                boltCutters.setVisibility(View.GONE);

            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!items.get(6).equals("boltcutters")){
                    items.set(6,"false");
                }
                Intent i = new Intent (SixthActivity.this, SeventhActivity.class);
                startActivity(i);
            }
        });
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!items.get(6).equals("boltcutters")){
                    items.set(6,"false");
                }
                Intent i = new Intent(SixthActivity.this, FithActivity.class);
                startActivity(i);
            }
        });









    }
}
