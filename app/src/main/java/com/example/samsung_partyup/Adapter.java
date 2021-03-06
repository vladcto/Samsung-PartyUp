package com.example.samsung_partyup;

import android.content.Intent;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        private TextView textNameParty;
        private TextView textDate;
        private TextView textTime;
        private TextView textGeo;
        private TextView textPlace;
        private LinearLayout attrLayout;

        public ViewHolder(View items){
            super(items);
            imageParty = items.findViewById(R.id.imageParty);
            textNameParty = items.findViewById(R.id.textDescrip);
            textDate = items.findViewById(R.id.textDate);
            textTime = items.findViewById(R.id.textTime);
            textGeo = items.findViewById(R.id.textGeo);
            textPlace = items.findViewById(R.id.textPlace);
            attrLayout = items.findViewById(R.id.partyAttrLayout);
        }

        public void bind(final PartyInfo _party){
            imageParty.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent partyInfo = new Intent(context,PartyInfoActivity.class);
                    partyInfo.putExtra("partyName",_party.getTextPartyName());
                    partyInfo.putExtra("aboutParty",_party.getAboutParty());
                    partyInfo.putExtra("image",_party.getImageParty());
                    context.startPartyInfo(partyInfo);
                }
            });

            imageParty.setImageResource(_party.getImageParty());
            textNameParty.setText(_party.getTextPartyName());
            textDate.setText(_party.getTextDate());
            textTime.setText(_party.getTextTime());
            textGeo.setText(_party.getTextGeo());
            textPlace.setText(_party.getTextPlace());

            String[] partyAttr = _party.getPartyAttr();
            //Есть ли вообще атрибуты к вечеринке?
            if(partyAttr != null && partyAttr.length!=0){
                for (String attr:partyAttr) {
                    //Для каждого атрибута создаю TextView c нунжными натсройками.
                    TextView textView = new TextView(context);
                    textView.setText(attr);
                    textView.setGravity(Gravity.CENTER);
                    textView.setTextColor(Color.WHITE);
                    textView.setTextSize(10);
                    //Ставлю серый, полупрозрачный фон для TextView
                    textView.setBackgroundResource(R.drawable.party_attr_background);
                    //Привожу DP к пикселям
                    int pixels_pading = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, context.getResources().getDisplayMetrics());
                    textView.setPadding(pixels_pading,0,pixels_pading,0);
                    //Привожу DP к пикселям
                    int pixels_height = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, context.getResources().getDisplayMetrics());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,pixels_height);
                    //Привожу DP к пикселям
                    int pixels_margin = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2, context.getResources().getDisplayMetrics());
                    layoutParams.setMargins(pixels_margin,0,pixels_margin,0);
                    textView.setLayoutParams(layoutParams);
                    attrLayout.addView(textView);
                }
            }

        }
    }
}
