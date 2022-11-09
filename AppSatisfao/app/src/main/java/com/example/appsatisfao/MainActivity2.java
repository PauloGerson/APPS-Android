package com.example.appsatisfao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText editText;
    TextView nomeTxt, cidadeTxt;
    String nome, cidade;
    ImageView imgview;
    int idImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        nome = getIntent().getStringExtra("nome");
        nomeTxt = findViewById(R.id.Nome);
        nomeTxt.setText(nome);

        cidade = getIntent().getStringExtra("cidade");
        cidadeTxt = findViewById(R.id.Cidade);
        cidadeTxt.setText(cidade);

        idImg = getIntent().getIntExtra("humor", -1);
        imgview = findViewById(R.id.humorImg);
        imgview.setImageResource(idImg);




    }

    @Override
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
}