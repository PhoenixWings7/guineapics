package com.example.guineapics;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TileViewHolder extends RecyclerView.ViewHolder {
    public final TextView itemTextView;
    final RecyclerViewAdapter adapter;

    public TileViewHolder(@NonNull View itemView, RecyclerViewAdapter adapter) {
        super(itemView);
        this.itemTextView = itemView.findViewById(R.id.tile_textview);
        this.adapter = adapter;
    }
}
