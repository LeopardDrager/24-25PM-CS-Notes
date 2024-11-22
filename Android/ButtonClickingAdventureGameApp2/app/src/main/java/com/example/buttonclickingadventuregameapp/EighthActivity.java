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

public class EighthActivity extends AppCompatActivity {

    private Button escape, backward;

    private TextView outputTXT;
    private String outputMSG;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        escape = findViewById(R.id.escapeBTN);
        backward = findViewById(R.id.backwardBTN);
        outputTXT = findViewById(R.id.helloTXT);

        escape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(5).equals("carkeys")){
                    outputMSG = items.get(1) + " you have a really good eye!";
                    outputTXT.setText(outputMSG);
                    Intent i = new Intent(EighthActivity.this, EscapeActivity.class);
                    startActivity(i);
                }else if (items.get(5).equals("false")){
                    outputMSG = items.get(1) + " you better go look for it";
                    outputTXT.setText(outputMSG);
                }
            }
        });
       backward.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(EighthActivity.this, SeventhActivity.class);
               startActivity(i);
           }
       });












    }
}
