package com.iquestgroup.remotelearning.audioplayer;

import com.iquestgroup.remotelearning.interfaces.MusicPlayer;

public class CDPlayer implements MusicPlayer {

	private PlayList playList;
	
	public CDPlayer(PlayList playList) {
		this.playList = playList;
	}
	public void playMusic() {
		System.out.println("CDPlayer plays music");
	}

}
