package com.example.samsung_partyup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

        adapter.setItems(new PartyInfo(0,"Смотрим Тарантино на Невском",
                "Россия,Санкт-Петербург","04 апр.",
                "21:45","127 м."));
        adapter.setItems(new PartyInfo(0,"aваы",
                "12","b",
                "f","s"));
        adapter.setItems(new PartyInfo(0,"aыва",
                "12","b",
                "f","s"));
        adapter.setItems(new PartyInfo(0,"aфыввфы",
                "12","b",
                "f","s"));
        adapter.setItems(new PartyInfo(0,"уй123фвыa",
                "12","b",
                "f","s"));
    }

}
