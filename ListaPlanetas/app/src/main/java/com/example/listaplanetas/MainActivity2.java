package com.example.listaplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.nomePlaneta);
        img = findViewById(R.id.imagePlanetaUnica);

        Intent intent = getIntent();

        name.setText(intent.getStringExtra("name"));
        img.setImageResource(intent.getIntExtra("image", 0));


    }
}