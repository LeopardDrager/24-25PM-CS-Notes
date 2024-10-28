package com.example.madlibsgenerator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    private String forOutPutTXT = "";


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

        RadioButton madLibChoiceOneRB = findViewById(R.id.optionOneMadLibRB);
        RadioButton madLibChoiceTwoRB = findViewById(R.id.optionTwoMadLibRB);
        RadioButton madLibChoiceThreeRB = findViewById(R.id.optionThreeMadLibRB);

        Button generate = findViewById(R.id.generateBTN);
        Random rand = new Random();






        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String entry = inputTXT.getText().toString();
                String[] inputSeperater = entry.split(" ");


                if (madLibChoiceOneRB.isChecked() && inputSeperater.length >= 8){// Checking input for no less than 8 entries as this leads the code to cause
                    forOutPutTXT = "The very " + inputSeperater[0]  + " person was " + inputSeperater[1] + ". "  + inputSeperater[2]+ " was there name, they loved to "+inputSeperater[3] + ". " + "They were even once the " +inputSeperater[4] + " of the " + inputSeperater[5] +". "  + "Their greatest achievement was " +inputSeperater[6] + " while " + inputSeperater[7] + "."; //Concatenating the results into the madlib
                    outputTXT.setText(forOutPutTXT);
                }else if (madLibChoiceTwoRB.isChecked() && inputSeperater.length >= 8) {// Checking input for no less than 8 entries as this leads the code to cause
                    forOutPutTXT = inputSeperater[0] + " walked to " + inputSeperater[1] + ", while " + inputSeperater[2] +". They were a pro at " + inputSeperater[3] + ", because of their unique " + inputSeperater[4] +". Which allowed them to do " +inputSeperater[5] +", afterwards they would " + inputSeperater[6] +". Which reminded them of their " +inputSeperater[7] + "."; //Concatenating the results into the madlib
                    outputTXT.setText(forOutPutTXT);
                }else if (madLibChoiceThreeRB.isChecked() && inputSeperater.length >= 8){// Checking input for no less than 8 entries as this leads the code to cause
                    forOutPutTXT = "There once was a great " + inputSeperater[0] +", they were also excellent at " + inputSeperater[1]+ ". It got to a point they tried something called "+ inputSeperater[2] + ", they sucked at it. They decided to even try " +inputSeperater[3]+ ". When all else failed they went to their "+ inputSeperater[4] + ", to ask for advice on "+ inputSeperater[5] + ". Their " +inputSeperater[4]+ " told them to just simply "+inputSeperater[6] + ", which they simply were "+inputSeperater[7] + " by.";//Concatenating the results into the madlib
                    outputTXT.setText(forOutPutTXT);
                }else if (!madLibChoiceOneRB.isChecked() && !madLibChoiceTwoRB.isChecked() && !madLibChoiceThreeRB.isChecked() && inputSeperater.length >= 8){
                  int randomNumber = rand.nextInt(4); // random number generator for if the user just clicks generate
                    if(randomNumber == 1){
                        forOutPutTXT = "The very " + inputSeperater[0]  + " person was " + inputSeperater[1] + ". "  + inputSeperater[2]+ " was there name, they loved to "+inputSeperater[3] + ". " + "They were even once the " +inputSeperater[4] + " of the " + inputSeperater[5] +". "  + "Their greatest achievement was " +inputSeperater[6] + " while " + inputSeperater[7] + ".";
                        outputTXT.setText(forOutPutTXT);
                    }else if (randomNumber == 2){
                        forOutPutTXT = inputSeperater[0] + " walked to " + inputSeperater[1] + ", while " + inputSeperater[2] +". They were a pro at " + inputSeperater[3] + ", because of their unique " + inputSeperater[4] +". Which allowed them to do " +inputSeperater[5] +", afterwards they would " + inputSeperater[6] +". Which reminded them of their " +inputSeperater[7] + ".";
                        outputTXT.setText(forOutPutTXT);
                    }else if (randomNumber == 3){
                        forOutPutTXT = "There once was a great" + inputSeperater[0] +", they were also excellent at " + inputSeperater[1]+ ". It got to a point they tried something called "+ inputSeperater[2] + ", they sucked at it. They decided to even try " +inputSeperater[3]+". When all else failed they went to their "+ inputSeperater[4] + ", to ask for advice on "+ inputSeperater[5] + ". Their " +inputSeperater[5]+ " told them to just simply "+inputSeperater[6] +", which they simply were "+inputSeperater[7] + " by.";
                        outputTXT.setText(forOutPutTXT);
                    }

                }else {
                    forOutPutTXT = "You did not enter eight characters/words.";
                    outputTXT.setText(forOutPutTXT);
                }


            }
        });





    }

}
