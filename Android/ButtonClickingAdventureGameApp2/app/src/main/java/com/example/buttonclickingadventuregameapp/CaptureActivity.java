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
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);

        TextView messageTXT = findViewById(R.id.helloTXT);
        Button retryBTN = findViewById(R.id.retryBTN);
        String message;

            if (items.get(0).equals("false") && items.get(4).equals("true")) {
                message = items.get(1) + " was caught because they couldn't find the paperclip";
            }else if (items.get(4).equals("false") || items.get(6).equals("true")){
                message = items.get(1) + " ran into a guard";
            }
            else {
                message = items.get(1) + ", has been caught!";
            }

        messageTXT.setText(message);

        retryBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i<items.size(); i++){
                    items.set(i,"");
                }
                Intent i = new Intent(CaptureActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}
