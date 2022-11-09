package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_button;
    EditText txtinput,txtinput2;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            btn_button = findViewById(R.id.button);
            txtinput = (EditText) findViewById(R.id.editTextTextPersonName);
            txtinput2 = (EditText) findViewById(R.id.editTextTextPersonName2);

            btn_button.setOnClickListener(acaobotao());


    }

    private View.OnClickListener acaobotao(){
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String teste = txtinput.toString();
                Intent intent = new Intent(getActivity(), MainActivity2.class);
                intent.putExtra("nome", txtinput.getText().toString());
                if(txtinput.getText().toString().equals("paulo") && txtinput2.getText().toString().equals("1234")){
                    startActivity(intent);
                }else{

                        AlertDialog dialog = new AlertDialog.Builder(getActivity()).create();
                        dialog.setTitle("Alerta");
                        dialog.setMessage("campo vazio ou senha incorreta");
                        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });

                        dialog.show();

                }
            }
        };

    }

    public Context getActivity(){
        return this;
    }
}
