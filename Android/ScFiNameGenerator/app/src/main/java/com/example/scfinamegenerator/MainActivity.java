package com.example.scfinamegenerator;

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

import java.util.Random;

public class MainActivity extends AppCompatActivity {

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
        double randomness = Math.random();
        Button generateBTN = findViewById(R.id.generateBTN);
        TextView outputTXT = findViewById(R.id.outputTXT);
        EditText fName = findViewById(R.id.fNameEDT);
        EditText lName = findViewById(R.id.lNameEDT);
        EditText quest = findViewById(R.id.questEDT);
        EditText color = findViewById(R.id.colorEDT);
        EditText swallow = findViewById(R.id.swallowEDT);
        EditText eOrA = findViewById(R.id.eaEDT);

        //finish out your findViewById

        generateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Where your code from August goes

                String fNameEdit = fName.toString().substring(0,2);
                String lNameEdit = fName.toString().substring(lName.length()-2,lName.length());

                String questEdit = quest.toString().substring(0,4);
                String colorEdit = color.toString().substring(color.length()-3,color.length());


                //Random # btwn 0-10
                int randNumber = 1+(int)(randomness*2);


                String swallowEdit = swallow.toString().substring(0,randNumber);

                String eOrAEdit = eOrA.toString().substring( eOrA.length(),eOrA.length());

                String SciFiFirstName = fNameEdit + lNameEdit;
                String SciFiLastName = questEdit + colorEdit;
                String ScFiOrigin = swallowEdit + eOrAEdit;



                String outputFinal = ("\nHowdy " + SciFiFirstName  + " " + SciFiLastName + " from " + ScFiOrigin);
                outputTXT.setText (outputFinal);

            }
        });

    }
}