package com.iquestgroup.remotelearning.audioplayer;


import com.iquestgroup.remotelearning.interfaces.MusicPlayer;

public class IPod implements MusicPlayer {
	
	private PlayList playList;
	
	public IPod(PlayList playList) {
		this.playList = playList;
	}
	
	public void playMusic() {
		System.out.println("IPod plays music");
	}

}
