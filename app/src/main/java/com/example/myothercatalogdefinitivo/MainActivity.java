package com.example.myothercatalogdefinitivo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        List<PokemonData> data = new ArrayList<>();
        data.add(new PokemonData( name:"Bulbasaur", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        data.add(new PokemonData( name: "Ivysaur", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        data.add(new PokemonData( name: "Venosaur", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        data.add(new PokemonData( name: "Charmander", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        data.add(new PokemonData( name: "Charmeleon", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        data.add(new PokemonData( name: "Charizard", imageUrl("https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json")));
        PokemonRecyclerViewAdapter adapter = new  PokemonRecyclerViewAdapter(data, activity this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context: this));
    }
}