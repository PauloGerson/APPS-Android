package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.entity.Pessoa;

public class MainActivity2 extends AppCompatActivity {

    String peso,altura, idade;
    TextView txt;
    Button btnIMC, btnEleitor;

    Pessoa person = new Pessoa();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            //nome = getIntent().getStringExtra("sexo");
            altura = getIntent().getStringExtra("altura");
            peso = getIntent().getStringExtra("peso");
            idade = getIntent().getStringExtra("idade");

            btnIMC = findViewById(R.id.btnIMC);
            btnIMC.setOnClickListener(calcIMC());

            btnEleitor = findViewById(R.id.btnEleitor);
            btnEleitor.setOnClickListener(eleitor());

    }

    public View.OnClickListener calcIMC(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float imcPeso = Float.parseFloat(peso);
                float imcAltura = Float.parseFloat(altura);

                AlertDialog dialog = new AlertDialog.Builder(getActivity()).create();
                dialog.setTitle("IMC");
                dialog.setMessage(person.IMC(imcPeso,imcAltura));
                dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                dialog.show();

            }
        };
    }

    public View.OnClickListener eleitor(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idadeEleitor = Integer.parseInt(idade);

                AlertDialog dialog = new AlertDialog.Builder(getActivity()).create();
                dialog.setTitle("Eleitor");
                dialog.setMessage(person.faixaEleitorial(idadeEleitor));
                dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                dialog.show();
            }
        };
    }

    public Context getActivity(){
        return this;
    }
}