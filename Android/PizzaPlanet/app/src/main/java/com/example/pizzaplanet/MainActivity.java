package com.example.pizzaplanet;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        // link a Java object to your widgets
        CheckBox cheese = findViewById(R.id.cheeseCB);
        CheckBox sausage = findViewById(R.id.sausageCB);
        CheckBox peporoni = findViewById(R.id.peporoniCB);

        RadioButton small = findViewById(R.id.smallRB);
        RadioButton large = findViewById(R.id.largeRB);
        RadioButton extraLarge = findViewById(R.id.extraLargeRB);
        Button submit = findViewById(R.id.submitBTN);
        //set any onclicklisteners

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String order = "";
                String topping = "";
                if(cheese.isChecked()){
                    topping += "cheese";
                }
                if(sausage.isChecked()){
                    topping += "sausage";
                }
                if(peporoni.isChecked()){
                    topping += "peporini";
                }
                if(small.isChecked()){
                    order = "small " + topping +" pizza";
                }
                //sizeRG.getCheckedRadioButtonId() this will get which id is checked

                //makeText(Which activity is Toasting, message, how long).show()
                Toast.makeText(MainActivity.this,order,Toast.LENGTH_LONG).show();
                Log.d("Pizza Order", order);



            }
        });

    }
}