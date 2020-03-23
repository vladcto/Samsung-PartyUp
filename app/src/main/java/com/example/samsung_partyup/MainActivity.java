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

        adapter.setItems(new PartyInfo(R.drawable.test,"Смотрим Тарантино на Невском",
                "Россия,Санкт-Петербург","04 апр.",
                "21:45","127 м.","a"));
        adapter.setItems(new PartyInfo(R.drawable.test,"aваыwrerwerewrwerwerwerwerwerwerwerwerewrwrewrrwerewrwre",
                "12","b",
                "f","s","a"));
        adapter.setItems(new PartyInfo(R.drawable.test,"aыва",
                "12","b",
                "f","s","a"));
        adapter.setItems(new PartyInfo(R.drawable.test,"aфыввфы",
                "12","b",
                "f","s","a"));
        adapter.setItems(new PartyInfo(R.drawable.test,"уй123фвыa",
                "12","b",
                "f","s","a"));
    }

    public void startPartyInfo(Intent intent){
        startActivity(intent);
    }

}
