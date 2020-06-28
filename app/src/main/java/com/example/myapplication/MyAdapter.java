package com.example.myapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CardViewViewHolder> {
    private ArrayList<Laptop>laptops;

    public MyAdapter(ArrayList<Laptop> laptops) {
        this.laptops = laptops;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        Laptop laptop = laptops.get(position);

        holder.dataNama.setText(laptop.getNama());
        holder.dataHarga.setText(laptop.getHarga());
        holder.dataSpec.setText(laptop.getSpec());
        holder.dataImg.setImageResource(laptop.getGambar());

    }

    @Override
    public int getItemCount() {
        return laptops.size();
    }


    public class CardViewViewHolder extends RecyclerView.ViewHolder {
            TextView dataNama,dataHarga, dataSpec;
            CardView cvLaptop;
            ImageView dataImg;


        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            dataNama = itemView.findViewById(R.id.txtnama);
            dataHarga = itemView.findViewById(R.id.txtharga);
            dataSpec = itemView.findViewById(R.id.txtspec);
            dataImg = itemView.findViewById(R.id.img_gambar);
            cvLaptop =itemView.findViewById(R.id.cv_laptop);

        }
    }
}

