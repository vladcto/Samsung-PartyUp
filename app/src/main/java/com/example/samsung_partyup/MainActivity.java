package com.example.samsung_partyup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter();
        recyclerView.setAdapter(adapter);

        adapter.setItems(new PartyInfo(0,"aа","b",
                "f","s"));
        adapter.setItems(new PartyInfo(0,"aваы","b",
                "f","s"));
        adapter.setItems(new PartyInfo(0,"aыва","b",
                "f","s"));
        adapter.setItems(new PartyInfo(0,"aфыввфы","b",
                "f","s"));
        adapter.setItems(new PartyInfo(0,"уй123фвыa","b",
                "f","s"));
    }

}
