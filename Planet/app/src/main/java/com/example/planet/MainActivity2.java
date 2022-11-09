package com.example.planet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.planet.databinding.ActivityMain2Binding;
import com.example.planet.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    TextView texto;
    ActivityMain2Binding binding;
    String valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main2);

        Intent intent = this.getIntent();
        if(intent != null){
            int image = intent.getIntExtra("imagem", R.drawable.jupiter);
            String nome = intent.getStringExtra("nome");
            String descricao = intent.getStringExtra("descricao");


            binding.imagePLaneta.setImageResource(image);
            binding.namePlaneta.setText(nome);
            binding.descricao.setText(descricao);

        }

    }
}