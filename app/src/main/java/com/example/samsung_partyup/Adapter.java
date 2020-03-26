package com.example.samsung_partyup;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
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
        private LinearLayout attrLayout;

        public ViewHolder(View items){
            super(items);
            imageParty = items.findViewById(R.id.imageParty);
            textDescription = items.findViewById(R.id.textDescrip);
            textDate = items.findViewById(R.id.textDate);
            textTime = items.findViewById(R.id.textTime);
            textGeo = items.findViewById(R.id.textGeo);
            textPlace = items.findViewById(R.id.textPlace);
            attrLayout = items.findViewById(R.id.partyAttrLayout);
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

            String[] partyAttr = _party.getPartyAttr();
            if(partyAttr != null && partyAttr.length!=0){
                for (String attr:partyAttr) {

                    TextView textView = new TextView(context);
                    textView.setText(attr);
                    final float scale = context.getResources().getDisplayMetrics().density;
                    int pixels = (int) (20 * scale + 0.5f);
                    textView.setHeight(pixels);
                    textView.setGravity(Gravity.CENTER);
                    textView.setTextColor(Color.WHITE);
                    textView.setTextSize(8);
                    textView.setBackgroundResource(R.drawable.party_attr_background);
                    textView.setPadding(2,0,2,0);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,pixels);
                    layoutParams.setMargins(2,0,2,0);
                    textView.setLayoutParams(layoutParams);
                    attrLayout.addView(textView);
                }
            }

        }
    }
}
