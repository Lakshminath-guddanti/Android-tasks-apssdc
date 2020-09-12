package com.example.androidversions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class Versiontable extends RecyclerView.Adapter<Versiontable.MyViewHolder> {
    Context ctx;
    String titles[],versions[],rel_date[];
    int img[];
    public Versiontable(Context ctx, String[] titles, String[] versions, String[] rel_date, int[] img) {
        this.ctx = ctx;
        this.titles = titles;
        this.versions = versions;
        this.rel_date = rel_date;
        this.img = img;
    }





    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(ctx).inflate(R.layout.recyclerdetails,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtvew.setText(titles[position]);
        holder.img.setImageResource(img[position]);
        holder.versionview.setText(versions[position]);
        holder.relDatav.setText(rel_date[position]);
    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txtvew, versionview,relDatav;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.iv);
            txtvew = itemView.findViewById(R.id.tv);
            versionview = itemView.findViewById(R.id.version);
            relDatav = itemView.findViewById(R.id.redate);
        }
    }
}
