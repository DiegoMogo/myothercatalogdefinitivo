package com.example.myothercatalogdefinitivo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class pokemonviewholder extends RecyclerView.ViewHolder {
private final TextView textView;
private final ImageView imageView;

public  pokemonviewholder(@NonNull View itemView){
    super(itemView);
    textView = (TextView)  itemView.findViewById(R.id.pokemon_name_text_view);
    imageView = (ImageView) itemView.findViewById(R.id.pokemon_image_view);
}
public void showData(PokemonData data, Activity activity) {
    textView.setText(data.getName());
    cancelPreviousImageDownloadIfAny();
    LoadImage(data.getImageUrl(),activity);

}

private void cancelPreviousImageDownloadIfAny(){}

private void LoadImage(string imageUrl, Activity activity){...}

private Bitmap getBitmapFromUrl(String urlString) {...}
}
