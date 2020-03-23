package com.example.samsung_partyup;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<PartyInfo> party = new ArrayList<PartyInfo>();
    private MainActivity context;

    public Adapter(MainActivity context){
        this.context = context;
    }
    @Override
    public  ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_party, parent, false);
        return new  ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(party.get(position));
    }


    @Override
    public int getItemCount() {
        return party.size();
    }

    public void setItems(PartyInfo _party) {
        party.add(_party);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageParty;
        private TextView textDescription;
        private TextView textDate;
        private TextView textTime;
        private TextView textGeo;
        private TextView textPlace;

        public ViewHolder(View items){
            super(items);
            imageParty = items.findViewById(R.id.imageParty);
            textDescription = items.findViewById(R.id.textDescrip);
            textDate = items.findViewById(R.id.textDate);
            textTime = items.findViewById(R.id.textTime);
            textGeo = items.findViewById(R.id.textGeo);
            textPlace = items.findViewById(R.id.textPlace);
        }

        public void bind(final PartyInfo _party){
            imageParty.setImageResource(_party.getImageParty());

            imageParty.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent partyInfo = new Intent(context,PartyInfoActivity.class);
                    partyInfo.putExtra("partyName",_party.getTextDescription());
                    partyInfo.putExtra("aboutParty",_party.getAboutParty());
                    partyInfo.putExtra("image",_party.getImageParty());
                    context.startPartyInfo(partyInfo);
                }
            });

            textDescription.setText(_party.getTextDescription());
            textDate.setText(_party.getTextDate());
            textTime.setText(_party.getTextTime());
            textGeo.setText(_party.getTextGeo());
            textPlace.setText(_party.getTextPlace());
        }
    }
}
