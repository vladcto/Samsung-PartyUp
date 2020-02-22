package com.example.samsung_partyup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<PartyInfo> party = new ArrayList<PartyInfo>();

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

        public ViewHolder(View items){
            super(items);
            imageParty = items.findViewById(R.id.imageParty);
            textDescription = items.findViewById(R.id.textDescrip);
            textDate = items.findViewById(R.id.textDate);
            textTime = items.findViewById(R.id.textTime);
            textGeo = items.findViewById(R.id.textGeo);
        }

        public void bind(PartyInfo _party){
            //imageParty.setImageURI();
            textDescription.setText(_party.getTextDescription());
            textDate.setText(_party.getTextDate());
            textTime.setText(_party.getTextTime());
            textGeo.setText(_party.getTextGeo());
        }
    }
}
