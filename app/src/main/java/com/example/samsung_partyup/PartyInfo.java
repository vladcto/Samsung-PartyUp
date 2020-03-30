package com.example.samsung_partyup;

public class PartyInfo {
    private int imageParty;
    private String textPartyName;
    private String textDate;
    private String textTime;
    private String textGeo;
    private String textPlace;
    private String aboutParty;
    private String[] partyAttr;

    public PartyInfo(int imageParty, String textPartyName, String textPlace, String textDate, String textTime, String textGeo, String aboutParty, String[] partyAttr) {
        this.imageParty = imageParty;
        this.textPartyName = textPartyName;
        this.textDate = textDate;
        this.textTime = textTime;
        this.textGeo = textGeo;
        this.textPlace = textPlace;
        this.aboutParty = aboutParty;
        //Ставлю предел для атрибутов в 4.
        int min_length = Math.min(partyAttr.length,4);
        this.partyAttr = new String[min_length];
        for (int i=0;i<min_length;++i){
            this.partyAttr[i] = partyAttr[i];
        }
    }

    public PartyInfo(int imageParty, String textPartyName, String textPlace, String textDate, String textTime, String textGeo, String aboutParty) {
        this.imageParty = imageParty;
        // Название вечеринки
        this.textPartyName = textPartyName;
        this.textDate = textDate;
        this.textTime = textTime;
        this.textGeo = textGeo;
        this.textPlace = textPlace;
        this.aboutParty = aboutParty;
        this.partyAttr = null;
    }

    //region get'еры

    public int getImageParty() {
        return imageParty;
    }

    public String getAboutParty(){
        return aboutParty;
    }

    public String getTextPartyName() {
        return textPartyName;
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

    //endregion
}
