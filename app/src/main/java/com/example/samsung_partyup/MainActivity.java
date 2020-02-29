package com.example.samsung_partyup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(this);
        recyclerView.setAdapter(adapter);

        adapter.setItems(new PartyInfo(0,"Смотрим Тарантино на Невском",
                "Россия,Санкт-Петербург","04 апр.",
                "21:45","127 м.","a"));
        adapter.setItems(new PartyInfo(0,"aваы",
                "12","b",
                "f","s","a"));
        adapter.setItems(new PartyInfo(0,"aыва",
                "12","b",
                "f","s","a"));
        adapter.setItems(new PartyInfo(0,"aфыввфы",
                "12","b",
                "f","s","a"));
        adapter.setItems(new PartyInfo(0,"уй123фвыa",
                "12","b",
                "f","s","a"));
    }

    public void startPartyInfo(Intent intent){
        startActivity(intent);
    }

}
