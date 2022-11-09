package com.example.chekbox_radiobutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView txtNome1, txtIdade, txtSexo, txtRock, txtSertanejo, txtPagode, txtForro, txtOutros;
    String recebeNome,recebeIdade, recebeSexo, recebeRock, recebeSertanejo, recebePagode, recebeForro, recebeOutros;
    Button btn;
    Pessoa dados = new Pessoa();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recebeNome = getIntent().getStringExtra("nome");
        recebeIdade = getIntent().getStringExtra("idade");
        recebeSexo = getIntent().getStringExtra("sexo");


        txtNome1 = findViewById(R.id.txtNome);
        txtNome1.setText(recebeNome);

        txtIdade = findViewById(R.id.txtIdade);
        txtIdade.setText(recebeIdade);

        txtSexo = findViewById(R.id.txtSexo);
        txtSexo.setText(recebeSexo);

        /*-------------Checkbox---------*/


        recebeRock = getIntent().getStringExtra("rock");
        recebeSertanejo = getIntent().getStringExtra("sertanejo");
        recebePagode = getIntent().getStringExtra("pagode");
        recebeForro = getIntent().getStringExtra("forro");
        recebeOutros = getIntent().getStringExtra("outros");
        
        txtRock = findViewById(R.id.txtRock);
        txtRock.setText(recebeRock);
        
        txtSertanejo = findViewById(R.id.txtSertanejo);
        txtSertanejo.setText(recebeSertanejo);

        txtPagode = findViewById(R.id.txtPagode);
        txtPagode.setText(recebePagode);

        txtForro = findViewById(R.id.txtForro);
        txtForro.setText(recebeForro);

        txtOutros = findViewById(R.id.txtOutros);
        txtOutros.setText(recebeOutros);



    }

    public View.OnClickListener apresentaDados(){
        return new View.OnClickListener() {

            @Override
            public void onClick(View view) {






                /*  AlertDialog dialog = new AlertDialog.Builder(getActivity()).create();
                dialog.setTitle("Dados");
                dialog.setMessage(dados.pegarNome(recebeNome));
                dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                dialog.show();*/
            }
        };
    }
    public Context getActivity(){
        return this;
    }



}