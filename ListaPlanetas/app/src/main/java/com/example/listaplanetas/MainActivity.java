package com.example.listaplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] nomePlaneta = {"JUPTER","MARTE","MERCURIO","NETUNO", "SATURNO", "TERRA", "URANO", "VENUS"};
    int [] imageId = {R.drawable.jupiter, R.drawable.marte, R.drawable.mercurio, R.drawable.netuno, R.drawable.saturno,
            R.drawable.terra, R.drawable.urano, R.drawable.venus};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new  CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("name",nomePlaneta[i]);
                intent.putExtra("image", imageId[i]);
                startActivity(intent);
            }
        });


    }

    private class  CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return imageId.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.planeta, null);

            TextView name = view1.findViewById(R.id.planeta);
            ImageView img = view1.findViewById(R.id.Titulo);

            name.setText(nomePlaneta[i]);
            img.setImageResource(imageId[i]);

            return  view1;
        }
    }
}