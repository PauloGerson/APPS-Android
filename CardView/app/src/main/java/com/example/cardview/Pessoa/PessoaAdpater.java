package com.example.cardview.Pessoa;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;

import java.util.List;

public class PessoaAdpater extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<String> mDataset;

    public MyAdapter(List<String> myDataset) {
        this.mDataset = myDataset;
    }

    @Override
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        // each data item is just a string in this case
        public TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.setText(mDataset.get(position));

    }
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
