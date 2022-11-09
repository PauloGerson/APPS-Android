package com.example.planet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.planet.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView txt;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

        int [] imageId = {R.drawable.jupiter, R.drawable.marte, R.drawable.mercurio, R.drawable.netuno, R.drawable.saturno,
                            R.drawable.terra, R.drawable.urano, R.drawable.venus};

        String[] nomePlaneta = {"JUPTER","MARTE","MERCURIO","NETUNO", "SATURNO", "TERRA", "URANO", "VENUS"};
        String[] descricao = {"planeta 1", "planeta 2", "planeta 3", "planeta 4", "planeta 5", "planeta 7", "planeta 8" };

        ArrayList<Planetas> planetaz = new ArrayList<>();

        for(int i = 0; i < imageId.length; i++){

            Planetas planetas = new Planetas(nomePlaneta[i], descricao[i],imageId[i]);
            planetaz.add(planetas);
        }

        ListAdapter listAdapter = new ListAdapter(MainActivity.this, planetaz);

        binding.listview.setAdapter((listAdapter));
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity(), MainActivity2.class);
                intent.putExtra("imagem", imageId[position]);
                intent.putExtra("nome", nomePlaneta[position]);
                intent.putExtra("descricao", descricao[position]);
                startActivity(intent);
            }
        });
    }
    public Context getActivity(){
        return this;
    }
}