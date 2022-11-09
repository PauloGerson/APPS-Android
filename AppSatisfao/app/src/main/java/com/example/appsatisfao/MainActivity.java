package com.example.appsatisfao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    AutoCompleteTextView autoCompleteTextView;
    SeekBar seekBar;
    ImageView imageView;
    TextView textView;
    int idImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.txtNome);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);

        List<String> frutas = new ArrayList();
        frutas.add("Abreulândia");
        frutas.add("Tocantinópolis");
        frutas.add("Aguiarnópolis");
        frutas.add("Palmas");
        frutas.add("Araguaína");
        frutas.add("Gurupi");
        frutas.add("Almas");
        frutas.add("Dianópolis");

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,frutas);
        autoCompleteTextView.setAdapter(adapter);

        imageView = findViewById(R.id.imageView);

        seekBar = findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                seekBar.setMax(3);
                idImg = 0;

                if(progress == 1){
                    imageView.setImageResource(R.drawable.ruim);
                    idImg = R.drawable.ruim;
                    System.out.println("Imagem: " + idImg);
                    //textView.setText("RUIM");
                }
                else if(progress == 2){
                    imageView.setImageResource(R.drawable.bom);
                    idImg = R.drawable.bom;
                    System.out.println("Imagem: " + idImg);
                    //textView.setText("BOM");
                }
                else if(progress == 3){
                  imageView.setImageResource(R.drawable.otimo);
                  idImg = R.drawable.otimo;
                  System.out.println("Imagem: " + idImg);

                  //textView.setText("OTIMO");
                }else{
                    imageView.setImageResource(0);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        button = findViewById(R.id.btnEnviar);
        button.setOnClickListener(enviarDados());



    }

    public View.OnClickListener enviarDados(){
        return new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity2.class);
                intent.putExtra("nome", editText.getText().toString());
                intent.putExtra("cidade", autoCompleteTextView.getText().toString());

                intent.putExtra("humor", idImg);
                System.out.println("Imagem: " + idImg);
                startActivity(intent);
            }
        };
    }

    public Context getActivity(){
        return this;
    }
}