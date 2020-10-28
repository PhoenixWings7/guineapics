package com.example.guineapics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guineapics.dao.GuineaPigsDAO;
import com.example.guineapics.model.GuineaPig;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<TileViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<GuineaPig> guineaPigs = GuineaPigsDAO.getDAO().getArrayList();

    public RecyclerViewAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public TileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.tile_blueprint, parent, false);
        return new TileViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TileViewHolder holder, int position) {
        String currentTitle = guineaPigs.get(position).getName();
        holder.itemTextView.setText(currentTitle);
    }

    @Override
    public int getItemCount() {
        return guineaPigs.size();
    }
}
