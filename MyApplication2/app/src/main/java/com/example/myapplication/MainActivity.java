package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    private RecyclerView.Adapter mAdapter;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    List<Pessoa> teste;
    CardView teste1;

    //List<String> teste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.listRecicle);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);


        teste = new ArrayList<>();

        Pessoa p1 = new Pessoa("João", "12", "É um adolescete sonhador da periferia do rio que sonha em ser " +
                "astronauta");
        Pessoa p2 = new Pessoa("Paulo", "30", "É um jovem senhor que trabalha com programação");
        Pessoa p3 = new Pessoa("Jessica", "18", "É uma jovem do Tocantins que sonha em ser enfermeira");
        Pessoa p4 = new Pessoa("Fernanda", "25", "É uma jovem que está fazendo intercabio na europa para se tornar medica.");
        Pessoa p5 = new Pessoa("Naruto", "20", "É uma adoleceste da aldeia da folha e ele sonha em ser hokage.");
        Pessoa p6 = new Pessoa("José", "12", "José é um escritor famoso do Rio de Janeiro");

        teste.add(p1);
        teste.add(p2);
        teste.add(p3);
        teste.add(p4);
        teste.add(p5);
        teste.add(p6);

        mAdapter = new MyAdapter(teste);
        recyclerView.setAdapter(mAdapter);

    }

    /*public AlertDialog textAlert(String txt){
        AlertDialog dialog = new AlertDialog.Builder(getActivity()).create();
        dialog.setMessage(txt);
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        dialog.show();

        return dialog;
    }*/


    public Context getActivity() {
        return this;
    }


}