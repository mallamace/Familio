package com.mallamace.famlio;

public class Track {

    private String trackTitleName;
    private String trackFileName;

    public Track(String trackTitle, String trackFile){

        trackTitleName = trackTitle;
        trackFileName = trackFile;
    }

    public String getTrackTitleName(){

        return trackTitleName;
    }

    public String getTrackFileName(){

        return trackFileName;
    }
}
