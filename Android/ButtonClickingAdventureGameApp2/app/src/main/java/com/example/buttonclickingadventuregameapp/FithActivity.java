package com.example.buttonclickingadventuregameapp;

import static com.example.buttonclickingadventuregameapp.MainActivity.items;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FithActivity extends AppCompatActivity {

    private Button pickLock, lookForPaperClip;
    private TextView outputTXT;
    private String outputMSG;

    private int temp;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        pickLock = findViewById(R.id.pickBTN);
        lookForPaperClip = findViewById(R.id.lookBTN);
        outputTXT = findViewById(R.id.helloTXT);
        outputMSG = " I hope you have the paperclip!";
        outputTXT.setText(outputMSG);

        pickLock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(0).equals("paperclip")){
                    outputMSG = items.get(1) + ", you have a good eye, nice job!";
                    outputTXT.setText(outputMSG);
                    items.set(2,"false");
                    Intent i = new Intent(FithActivity.this, SixthActivity.class);
                    startActivity(i);



                }else if (items.get(0).equals("false")){
                    items.set(2,"true");
                    outputMSG = items.get(1) + " nice try but you don't have it!";
                    outputTXT.setText(outputMSG);
//                    Intent i = new Intent(FithActivity.this, CaptureActivity.class);
//                    startActivity(i);
                }
            }
        });
        lookForPaperClip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(0).equals("paperclip")){
                    outputMSG = items.get(1) + " you already have it!";
                    outputTXT.setText(outputMSG);
                }else if (items.get(0).equals("false")){
                    items.set(5, "true");
                    Intent i = new Intent(FithActivity.this, CaptureActivity.class);
                    startActivity(i);

                }
            }
        });



    }
}
