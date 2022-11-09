package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {

    TextView texto;
    Button btnVoltar;
    String valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        valor = getIntent().getStringExtra("nome");
        texto = findViewById(R.id.textView);
        texto.setText("Seja bem vindo " + valor.toUpperCase());

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //identificar a ação de voltar a tela
            case android.R.id.home:
                //encerra a activity
                finish();
                break;
        }

        return super.onOptionsItemSelected( item );
    }


    public Context getActivity(){
        return this;
    }
}