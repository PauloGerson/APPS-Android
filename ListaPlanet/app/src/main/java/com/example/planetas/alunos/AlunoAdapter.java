package com.example.planetas.alunos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.planetas.R;

import java.util.List;

public class AlunoAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<Aluno> alunos;

    public AlunoAdapter(Context context, List<Aluno> alunos) {
        this.inflater = LayoutInflater.from(context);
        this.alunos = alunos;
    }

    @Override
    public int getCount() {
        return alunos.size();
    }

    @Override
    public Object getItem(int i) {
        return alunos.get(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        //identifica o item(objeto aluno) da lista através do "position"
        Aluno aluno = alunos.get(position);
        //infla o layout "itens_lista_customizada_aluno" para referênciar/receber o item
        view = inflater.inflate(R.layout.itens_list_alunos, null);
        //aponta qual dado o componente do layout vai receber
        ((TextView)view.findViewById(R.id.textView)).setText(aluno.getNome());
        ((TextView)view.findViewById(R.id.textView2)).setText(String.valueOf(aluno.getNota1()));
        ((TextView)view.findViewById(R.id.textView3)).setText(String.valueOf(aluno.getNota2()));
        //((ImageView)view.findViewById(R.id.imageView)).setImageResource();

        return view;
    }

}
