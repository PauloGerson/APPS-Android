package com.example.planetas.alunos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.planetas.MainActivity;
import com.example.planetas.R;

import java.util.List;

public class PlanetaAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<Planeta> planetas;

    public PlanetaAdapter(Context context, List<Planeta> planetasObj) {
        this.inflater = LayoutInflater.from(context);
        this.planetas = planetasObj;
    }

    @Override
    public int getCount() {
        return planetas.size();
    }

    @Override
    public Object getItem(int i) {
        return planetas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Planeta planeta = planetas.get(i);
        view = inflater.inflate(R.layout.itens_planetas, null);

        ((ImageView)view.findViewById(R.id.imagePlaneta)).setImageResource(planeta.getImageId());
        ((TextView)view.findViewById(R.id.descricaoPlaneta)).setText(planeta.getDescricao());
        ((TextView)view.findViewById(R.id.nomePlaneta)).setText(planeta.getNome_planeta());


        return view;
    }


}
