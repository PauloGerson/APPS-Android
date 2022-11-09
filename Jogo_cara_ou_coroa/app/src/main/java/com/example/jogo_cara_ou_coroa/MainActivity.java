package com.example.jogo_cara_ou_coroa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btn;
    TextView txt, contador;
    int cont = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.imageView2);
        txt = findViewById(R.id.textView);
        contador = findViewById(R.id.contador);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(radomImg());

    }
    public View.OnClickListener radomImg(){
        return new View.OnClickListener(){


            @Override
            public void onClick(View view) {


                Random radomico = new Random();
                int valor = radomico.nextInt(2);

                contador.setText("Contador: " + cont);
                cont++;
                if(valor == 0){
                    imageView.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.cara));
                    txt.setText("cara");
                }else{
                    imageView.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.coroa));
                    txt.setText("coroa");
                }

                //cont++;
            }

        };
    }

    public Context getActivity(){
        return this;
    }
}