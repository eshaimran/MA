package com.labs.lab9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Food extends AppCompatActivity {
    Button addbiryani,addpizza,addburger,addtikka;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        addbiryani=findViewById(R.id.addbiryani);
        addpizza=findViewById(R.id.addpizza);
        addburger=findViewById(R.id.addburger);
        addtikka=findViewById(R.id.addtikka);
        addbiryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Food.this,"Added to card",Toast.LENGTH_SHORT).show();
            }
        });
        addpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Food.this,"Added to card",Toast.LENGTH_SHORT).show();
            }
        });
        addburger.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(Food.this,"Added to card",Toast.LENGTH_SHORT).show();
        }
        });
        addtikka.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(Food.this,"Added to card",Toast.LENGTH_SHORT).show();
        }
    });

    }

}
