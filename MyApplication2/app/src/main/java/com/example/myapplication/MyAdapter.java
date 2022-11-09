package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    List<Pessoa> mDataset;
    Context contex;
    View viweTxt;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<Pessoa> myDataset) {
        this.mDataset = myDataset;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        // each data item is just a string in this case
        public TextView textView, textView2;

        public MyViewHolder(View itemView) {
            super(itemView);


            textView = itemView.findViewById(R.id.textNome);
            textView2 = itemView.findViewById(R.id.textIdade);


           /* itemView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View view) {
                   //Toast.makeText(itemView.getContext(), mDataset.get(getAdapterPosition()).getDescricao() , Toast.LENGTH_SHORT).show();

                    AlertDialog dialog = new AlertDialog.Builder(itemView.getContext()).create();
                    dialog.setTitle(mDataset.get(getAdapterPosition()).getNome().toUpperCase());
                    dialog.setMessage(mDataset.get(getAdapterPosition()).getDescricao());
                    dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener(){

                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    dialog.show();



                }
            })*/;

        }
    }



    // Create new views (invoked by the layout manager)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista, parent, false);

        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder,  int position) {
        //Pessoa p = new Pessoa();
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        holder.textView.setText(mDataset.get(position).getNome());
        holder.textView2.setText(mDataset.get(position).getIdade());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = new AlertDialog.Builder(holder.itemView.getContext()).create();
                dialog.setTitle(mDataset.get(holder.getAdapterPosition()).getNome().toUpperCase());
                dialog.setMessage(mDataset.get(holder.getAdapterPosition()).getDescricao());
                dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                dialog.show();
                

            }
        });

    }

    // Return the size of your dataset (invoked by the layout manager)




}
