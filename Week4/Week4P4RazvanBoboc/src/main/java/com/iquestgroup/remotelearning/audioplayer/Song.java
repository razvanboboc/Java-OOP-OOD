package com.iquestgroup.remotelearning.audioplayer;

import com.iquestgroup.remotelearning.model.Band;

public class Song {
    private String songName;
    private String bandName;

    public Song(String songName, Band band){
        this.songName = songName;
        this.bandName = band.getBandName();
    }

    public String getSongName(){
        return songName;
    }

    public String getBandName(){
        return bandName;
    }
}
