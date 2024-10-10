package com.example.helloandroid;
//DO NOT......              DO NOT SCREW WITH THE PACKAGE......

//import all librarires
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsComp
//public - for all files to access it
//class -> defining a class for the JVM
//MainActivity -> this is where your entire app starts
//extends AppCompatActivity -> DO NOT TOUCH... The library that makes this
//          class have widget and app methods
public class MainActivity extends AppCompatActivity {

    //The decortor that overwrites the onCreate method from the AppCompatActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //ALL functions go below the onCreate stuff
    //a function for the button to take in user input and output to text view
    public void sayHello(View v){
        //View v -> is an object of the View class which assist the button to find this f(x)
        //      This goes back to the Model View Controller MVC or Game Loop
        //      YOU MUST DO THIS for using an onClick

        //obtain the info from the widgets
        //WhatLibrary objName = widget from the XML
        EditText userInput = findViewById(R.id.userInputEDT);
        TextView greetingText = findViewById(R.id.outPutTXT);

        //output something to the outputTXT
        String input = userInput.getText().toString();
        greetingText.setText("Hi " +input +" nice to meet you");

    }

}