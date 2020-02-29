package com.example.samsung_partyup;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PartyInfoActivity extends AppCompatActivity {

    public  PartyInfoActivity(){
    }

    TextView partyName;
    TextView aboutParty;
    ImageView closePartyInfo;
    Activity partyInfoActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.party_details);
        Bundle infos = getIntent().getExtras();
        partyName = findViewById(R.id.PartyName);
        partyName.setText(infos.getString("partyName"));
        aboutParty = findViewById(R.id.AboutParty);
        aboutParty.setText(infos.getString("aboutParty"));
        partyInfoActivity = this;
        closePartyInfo = findViewById(R.id.closePartyInfo);
        closePartyInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                partyInfoActivity.finish();
            }
        });

    }
}
