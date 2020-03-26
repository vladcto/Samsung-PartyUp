package com.example.samsung_partyup;

public class PartyInfo {
    private int imageParty;
    private String textDescription;
    private String textDate;
    private String textTime;
    private String textGeo;
    private String textPlace;
    private String aboutParty;
    private String[] partyAttr;

    public PartyInfo(int imageParty, String textDescription,String textPlace, String textDate, String textTime, String textGeo,String aboutParty,String[] partyAttr) {
        this.imageParty = imageParty;
        // Название вечеринки
        this.textDescription = textDescription;
        this.textDate = textDate;
        this.textTime = textTime;
        this.textGeo = textGeo;
        this.textPlace = textPlace;
        this.aboutParty = aboutParty;
        int min_length = Math.min(partyAttr.length,4);
        this.partyAttr = new String[min_length];
        for (int i=0;i<min_length;++i){
            this.partyAttr[i] = partyAttr[i];
        }
    }

    public PartyInfo(int imageParty, String textDescription,String textPlace, String textDate, String textTime, String textGeo,String aboutParty) {
        this.imageParty = imageParty;
        // Название вечеринки
        this.textDescription = textDescription;
        this.textDate = textDate;
        this.textTime = textTime;
        this.textGeo = textGeo;
        this.textPlace = textPlace;
        this.aboutParty = aboutParty;
        this.partyAttr = null;
    }

    public int getImageParty() {
        return imageParty;
    }

    public String getAboutParty(){
        return aboutParty;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public String getTextDate() {
        return textDate;
    }

    public String getTextTime() {
        return textTime;
    }

    public String getTextGeo() {
        return textGeo;
    }

    public String getTextPlace(){return textPlace;}

    public String[] getPartyAttr(){
        return partyAttr;
    }
}
