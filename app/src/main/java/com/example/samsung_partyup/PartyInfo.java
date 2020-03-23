package com.example.samsung_partyup;

public class PartyInfo {
    private int imageParty;
    private String textDescription;
    private String textDate;
    private String textTime;
    private String textGeo;
    private String textPlace;
    private String aboutParty;

    public PartyInfo(int imageParty, String textDescription,String textPlace, String textDate, String textTime, String textGeo,String aboutParty) {
        this.imageParty = imageParty;
        // Название вечеринки
        this.textDescription = textDescription;
        this.textDate = textDate;
        this.textTime = textTime;
        this.textGeo = textGeo;
        this.textPlace = textPlace;
        this.aboutParty = aboutParty;
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
}
