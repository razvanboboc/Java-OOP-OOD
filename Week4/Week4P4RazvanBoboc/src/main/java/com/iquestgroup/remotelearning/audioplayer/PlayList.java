package com.iquestgroup.remotelearning.audioplayer;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	private List<Song> listOfSongs;
	
	public PlayList() {
		listOfSongs = new ArrayList<Song>();
	}
	
	public void addSong(Song song) {
		listOfSongs.add(song);
	}

	public String getSongName(){
		return listOfSongs.get(listOfSongs.size() - 1).getSongName();
	}

	public String getBandName(){
		return listOfSongs.get(listOfSongs.size() - 1).getBandName();
	}

	public List getPlaylist(){
		return listOfSongs;
	}
}
