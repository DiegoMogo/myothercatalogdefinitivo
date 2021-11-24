package com.example.myothercatalogdefinitivo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PokemonRecyclerViewAdapter  extends RecyclerView.Adapter<pokemonviewholder> {

private List<PokemonData> allTheData;
private Activity activity;

public PokemonRecyclerViewAdapter(List<PokemonData> dataSet, Activity activity) {
    this.allTheData = dataSet;
    this.activity = activity;

}

public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.pokemon_view_holder, parent, attachToRoot:false);
    return new PokemonViewHolder(view);
}
public void onBindViewHolder(PokemonViewHolder holder, int position) {
        PokemonData dataInPositionToBeRendered = allTheData.get(position);
        holder.showData(dataInPositionToBeRendered, activity);
}
Public int getItemCount() {
    return allTheData.size();
    }
}
