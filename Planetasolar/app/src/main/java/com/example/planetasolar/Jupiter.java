package com.example.planetasolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.planetasolar.R;

public class Jupiter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jupiter);

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
    }

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