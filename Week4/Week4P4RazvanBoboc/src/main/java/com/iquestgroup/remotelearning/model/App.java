package com.iquestgroup.remotelearning.model;

import com.iquestgroup.remotelearning.audioplayer.CDPlayer;
import com.iquestgroup.remotelearning.audioplayer.IPod;
import com.iquestgroup.remotelearning.audioplayer.PlayList;
import com.iquestgroup.remotelearning.audioplayer.Song;

public class App {

	public static void main(String[] args) {

		Guitar guitar = new Guitar("Ibanez");
		Drums drums = new Drums("Drumpad2000");

		LeadGuitarist leadGuitarist = new LeadGuitarist(guitar);
		JazzDrummer jazzDrummer = new JazzDrummer(drums);

		Band firstBand = new Band("The Calling", jazzDrummer, leadGuitarist);
		Band secondBand = new Band("The Doors", jazzDrummer, leadGuitarist);
		firstBand.performConcert();
		secondBand.performConcert();

		Song firstSong = new Song("Boom Boom Boom", firstBand);
		Song secondSong = new Song("Ratamahatta", secondBand);

		PlayList playList = new PlayList();
		playList.addSong(secondSong);
		playList.addSong(firstSong);

		System.out.println("Current song being played is: " + playList.getSongName());

		CDPlayer cdPlayer = new CDPlayer(playList);
		IPod iPod = new IPod(playList);

		iPod.playMusic();
		cdPlayer.playMusic();

	}

}
