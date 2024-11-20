package com.example.buttonclickingadventuregameapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.example.buttonclickingadventuregameapp.MainActivity.items;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CaptureActivity extends AppCompatActivity {
    private TextView messageTXT;
    private String message;
    private Button retryBTN;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);
        messageTXT = findViewById(R.id.helloTXT);
        retryBTN = findViewById(R.id.retryBTN);

        message = items.get(9) + ", has been caught!";
        messageTXT.setText(message);
        retryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CaptureActivity.this, MainActivity.class);
                startActivity(i);

            }
        });





    }
}
