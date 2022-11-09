package com.example.planetasolar;



import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = findViewById(R.id.listview);

       List<String> list = new ArrayList<>();
        list.add("Marte");
        list.add("Jupiter");
        list.add("Mercurio");
        list.add("Netuno");
        list.add("Saturno");
        list.add("Terra");
        list.add("Urano");
        list.add("Venus");



        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1 , list);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    startActivity(new Intent(MainActivity.this, Marte.class));
                }
                else if( i == 1){
                    startActivity(new Intent(MainActivity.this, Jupiter.class));
                }
                else if(i == 2){
                    startActivity(new Intent(MainActivity.this, Mercurio.class));
                }
                else if(i == 3){
                    startActivity(new Intent(MainActivity.this, Netuno.class));
                }
                else if(i == 4){
                    startActivity(new Intent(MainActivity.this, Saturno.class));
                }
                else if (i == 5) {
                    startActivity(new Intent(MainActivity.this, Terra.class));
                }
                else if(i == 6){
                    startActivity(new Intent(MainActivity.this, Urano.class));
                }
                else if(i == 7){
                    startActivity(new Intent(MainActivity.this, Venus.class));
                }

            }
        });



    }

    public Context getActivity(){
        return this;
    }
}