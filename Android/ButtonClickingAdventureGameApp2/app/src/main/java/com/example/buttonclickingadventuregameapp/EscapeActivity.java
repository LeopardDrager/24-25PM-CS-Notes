package com.example.buttonclickingadventuregameapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.example.buttonclickingadventuregameapp.MainActivity.items;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EscapeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape);

        TextView messageTXT = findViewById(R.id.helloTXT);
        Button retryBTN = findViewById(R.id.retryBTN);
        String message;

       message = items.get(1) + " congrats you escaped from this guy!";

        messageTXT.setText(message);

        retryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EscapeActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}
