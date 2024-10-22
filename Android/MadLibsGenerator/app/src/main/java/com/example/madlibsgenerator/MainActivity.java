package com.example.madlibsgenerator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView outputTXT = findViewById(R.id.madLibPrintLocation);
        EditText inputTXT = findViewById(R.id.response);
        Button madLibChoiceOneBTN = findViewById(R.id.optionOneMadLibBTN);
        Button madLibChoiceTwoBTN = findViewById(R.id.optionTwoMadLibBTN);
        Button madLibChoiceThreeBTN = findViewById(R.id.optionThreeMadLibBTN);
        Button generate = findViewById(R.id.generateBTN);


        madLibChoiceOneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputTXT.setText("Button one");
                generate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String finishedMadLib = inputTXT.toString()

                    }
                });

            }
        });

        madLibChoiceTwoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputTXT.setText("Button two");

            }
        });
        madLibChoiceThreeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputTXT.setText("Button three");
            }
        });

    }

}
