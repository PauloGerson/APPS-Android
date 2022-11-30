package com.example.chekbox_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;
    RadioGroup radioGroup;
    RadioButton radioSelecionado;
    EditText valorNome, valorIdade;
    CheckBox rock, sertanejo,pagode, forro, outros;
    View view;
    ArrayList<String> resultado = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Inputs */
       valorNome = findViewById(R.id.inputNome);
       valorIdade = findViewById(R.id.inputIdade);

       btnEnviar = findViewById(R.id.brnEnviar);
       btnEnviar.setOnClickListener(enviarDados());

       /*Radio Buttons*/

        radioGroup = findViewById(R.id.radioGroup);

       


    }




    public View.OnClickListener enviarDados(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

                /*Radio buttons*/
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioSelecionado = findViewById(radioId);

                /*Checkbox*/
                CheckBox checkRock = (CheckBox)findViewById(R.id.checkrock);
                CheckBox checkSertanejo = (CheckBox)findViewById(R.id.checksertanejo);
                CheckBox checkPagode = (CheckBox)findViewById(R.id.checkpagode);
                CheckBox checkForro = (CheckBox)findViewById(R.id.checkforro);
                CheckBox checkOutros = (CheckBox)findViewById(R.id.checkoutros);


                boolean valorRock = checkRock.isChecked();
                boolean valorSertanejo = checkSertanejo.isChecked();
                boolean valorPagode = checkPagode.isChecked();
                boolean valorForro = checkForro.isChecked();
                boolean valorOutros = checkOutros.isChecked();

                if(valorRock){
                    intent.putExtra("rock", checkRock.getText().toString());
                }
                if(valorSertanejo){
                    intent.putExtra("sertanejo", checkSertanejo.getText().toString());
                }
                if(valorPagode){
                    intent.putExtra("pagode", checkPagode.getText().toString());
                }
                if(valorForro){
                    intent.putExtra("forro", checkForro.getText().toString());
                }
                if(valorOutros){
                    intent.putExtra("outros", checkOutros.getText().toString());
                }





                intent.putExtra("nome", valorNome.getText().toString());
                intent.putExtra("idade", valorIdade.getText().toString());
                intent.putExtra("sexo", radioSelecionado.getText().toString());





                startActivity(intent);
            }
        };
    }

    public Context getActivity(){
        return this;
    }
}
