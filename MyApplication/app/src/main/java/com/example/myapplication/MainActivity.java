package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.myapplication.entity.Pessoa;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;
    EditText peso, altura, idade;
    RadioGroup group;
    RadioButton radioButton;
    Pessoa person1 = new Pessoa();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group = findViewById(R.id.radiosexo);

        btnEnviar = findViewById(R.id.button);
        btnEnviar.setOnClickListener(cadastro());

        peso = findViewById(R.id.inputPeso);
        altura = findViewById(R.id.inputAltura);

        //idade = findViewById(R.id.inputIdade);

    }

    public View.OnClickListener cadastro(){
        return new Button.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), MainActivity2.class);

                intent.putExtra("peso", peso.getText().toString());
                intent.putExtra("altura", altura.getText().toString());

                

                //intent.putExtra("idade", idade.getText().toString());
                startActivity(intent);
            }
        };
    }


    /*public RadioButton radio(){


         return radioButton;
    }*/



    public Context getActivity(){
        return this;
    }
}