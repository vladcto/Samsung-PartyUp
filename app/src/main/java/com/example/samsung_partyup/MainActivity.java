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
        adapter.setItems(new PartyInfo(R.drawable.ramstain,"Раммштайн",
                "Россия,Санкт-Петербург,Футбольная ал., дом 8","12 апр.",
                "19:00","11,5 км.","N/A"));
        adapter.setItems(new PartyInfo(R.drawable.lera,"Вписка у Леры",
                "Россия, Санкт-Петербург,ул. Рубинштейна, дом 4321","04 апр.",
                "23:30","351 м.","N/A"));
        adapter.setItems(new PartyInfo(R.drawable.birthday,"День Рождения Лауры",
                "Россия, Санкт-Петербург, 2-я Советская ул., 27/2 A","05 апр.",
                "22:00","874 м.","N/A"));
        adapter.setItems(new PartyInfo(R.drawable.test,"уй123фвыa",
                "12","b",
                "f","s","N/A"));
    }

    public void startPartyInfo(Intent intent){
        startActivity(intent);
    }

}
