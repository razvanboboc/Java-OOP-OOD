package com.iquestgroup.remotelearning;

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

		Band band = new Band("The Calling", jazzDrummer, leadGuitarist);
		band.performConcert();

		Song firstSong = new Song("Boom Boom Boom");
		Song secondSong = new Song("Ratamahatta");

		PlayList playList = new PlayList();
		playList.addSong(secondSong);
		playList.addSong(firstSong);

		System.out.println("Current song being played is: " + playList.getSong());

		CDPlayer cdPlayer = new CDPlayer(playList);
		IPod iPod = new IPod(playList);
		
		iPod.playMusic();
		cdPlayer.playMusic();

	}

}
