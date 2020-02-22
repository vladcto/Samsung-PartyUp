package com.example.samsung_partyup;

public class PartyInfo {
    private int imageParty;
    private String textDescription;
    private String textDate;
    private String textTime;
    private String textGeo;

    public PartyInfo(int imageParty, String textDescription, String textDate, String textTime, String textGeo) {
        this.imageParty = imageParty;
        this.textDescription = textDescription;
        this.textDate = textDate;
        this.textTime = textTime;
        this.textGeo = textGeo;
    }

    public int getImageParty() {
        return imageParty;
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
}
