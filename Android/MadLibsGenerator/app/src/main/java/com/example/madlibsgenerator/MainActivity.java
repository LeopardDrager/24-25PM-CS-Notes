package com.example.madlibsgenerator;

import android.os.Bundle;
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

        RadioButton madLibChoiceOneRB = findViewById(R.id.optionOneMadLibRB);
        RadioButton madLibChoiceTwoRB = findViewById(R.id.optionTwoMadLibRB);
        RadioButton madLibChoiceThreeRB = findViewById(R.id.optionThreeMadLibRB);

        Button generate = findViewById(R.id.generateBTN);





        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String entry = inputTXT.getText().toString();
                String[] inputSeperater = entry.split(" ");

                if (madLibChoiceOneRB.isChecked()) {

                    outputTXT.setText(inputSeperater[1]);
                }


            }
        });





    }

}
