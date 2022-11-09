package com.example.planet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Planetas> {

    public ListAdapter(Context context, ArrayList<Planetas> planetasActivity){
        super(context, R.layout.list_item, planetasActivity);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planetas planeta = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView nomePlaneta = convertView.findViewById(R.id.nomePlaneta);


        //imageView.setImageResource(planeta.imageId);
        nomePlaneta.setText(planeta.nomePlaneta);
        //descricaoPlaneta.setText(planeta.descricao);

        return super.getView(position,convertView,parent);
    }
}
