package com.example.planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.planetas.alunos.Aluno;
import com.example.planetas.alunos.AlunoAdapter;
import com.example.planetas.alunos.Planeta;
import com.example.planetas.alunos.PlanetaAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    ListView listPlaneta;
    TextView txt;
    List<Planeta> planetasObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //List<Planeta> planetaObj = new ArrayList<>();
        //cria e inicializa os dados dos alunos
         //cria e inicializa os dados dos alunos
        //Aluno a1 = new Aluno("Aluno 1",9.5,6.8 );
        //Aluno a2 = new Aluno("Aluno 2",8.5,6.8);
        //Aluno a3 = new Aluno("Aluno 3",7.5,8.8);
        //Aluno a4 = new Aluno("Aluno 4",6.5,7.8);


        //alunos.add(a1);
        //alunos.add(a2);
        //alunos.add(a3);
        //alunos.add(a4);

        //Aluno teste = new Aluno(txt.setText("ola"));
        //AlunoAdapter alunoAdapter = new AlunoAdapter(this, planetasObj);

        listPlaneta = findViewById(R.id.listaPlaneta);

        planetasObj = new ArrayList<>();
        Planeta p1 = new Planeta("Jupiter",R.drawable.jupiter, "é o maior planeta do Sistema Solar possuindo uma massa 318 vezes maior que a da Terra.");
        Planeta p2 = new Planeta("Marte",R.drawable.marte, " Marte, também chamado de Planeta Vermelho, é o quarto planeta na ordem em relação ao Sol, estando a, aproximadamente, 227.940.000 km de distância dele.");
        Planeta p3 = new Planeta("Mercurio",R.drawable.mercurio, "Mercúrio é o planeta mais próximo do Sol, cerca de 57.910.000 km, e é o que possui a menor massa, ou seja, é o menor entre os planetas do Sistema Sola");
        Planeta p4 = new Planeta("Netuno",R.drawable.netuno, " Netuno foi descoberto em 1845 e não pode ser visto a olho nu. É o último planeta do Sistema Solar em relação ao Sol, estando a cerca de 4.504.300.000 km de distância desse.");
        Planeta p5 = new Planeta("Saturno",R.drawable.saturno, "Saturno encontra-se a, aproximadamente, 1.429.400.000 km do Sol e é o segundo maior planeta do Sistema Solar.");
        Planeta p6 = new Planeta("Terra",R.drawable.terra, "Terra é o terceiro planeta na ordem de proximidade com o Sol, encontrando-se a 149.600.000 km de distância desse.");
        Planeta p7 = new Planeta("Urano",R.drawable.urano, "Urano, um dos planetas gasosos, é o terceiro maior planeta do Sistema Solar, estando a, aproximadamente, 2.880.990.000 km do Sol.");
        Planeta p8 = new Planeta("venus",R.drawable.venus, "Vênus, também conhecido como Estrela Dalva, é o segundo planeta em relação ao Sol, estando, aproximadamente, a 108.200.000 km de distância.");

        planetasObj.add(p1);
        planetasObj.add(p2);
        planetasObj.add(p3);
        planetasObj.add(p4);
        planetasObj.add(p5);
        planetasObj.add(p6);
        planetasObj.add(p7);
        planetasObj.add(p8);


        PlanetaAdapter planetaAdapter = new PlanetaAdapter(this, planetasObj);
        listPlaneta.setAdapter(planetaAdapter);



        listPlaneta.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3){
                Toast.makeText(getApplicationContext(), planetasObj.get(position).getNome_planeta(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
    /*private View.OnClickListener acaoBotao() {
        return new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Olá Turma!",Toast.LENGTH_LONG).show();
            }
        };
    }*/

    public Context getActivity(){
        return this;
    }

}