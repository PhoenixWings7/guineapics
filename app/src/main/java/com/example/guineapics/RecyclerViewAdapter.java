package com.example.guineapics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guineapics.dao.GuineaPigsDAO;

public class RecyclerViewAdapter extends RecyclerView.Adapter<TileViewHolder> {
    private LayoutInflater inflater;
    private GuineaPigsDAO pigsDAO = GuineaPigsDAO.getDAO();

    //TODO: should I store the list or is DAO acceptable?
    public RecyclerViewAdapter(Context context /*, ArrayList<GuineaPig> guineaPigs*/) {
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public TileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.tile_blueprint, parent, false);
        return new TileViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull TileViewHolder holder, int position) {
        String currentTitle = pigsDAO.getByIndex(position).getName();
        holder.itemTextView.setText(currentTitle);
    }

    @Override
    //TODO: should I store itemCount as a final int in class to prevent errors
    // (for example if an item is added in the meantime)?

    public int getItemCount() {
        return pigsDAO.getPigsCount();
    }
}
