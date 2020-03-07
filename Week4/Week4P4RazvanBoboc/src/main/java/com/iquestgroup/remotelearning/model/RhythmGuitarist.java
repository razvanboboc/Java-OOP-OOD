package com.iquestgroup.remotelearning.model;

import com.iquestgroup.remotelearning.interfaces.Guitarist;

public class RhythmGuitarist implements Guitarist {

	private Guitar guitar;

	public RhythmGuitarist(Guitar guitar) {
		this.guitar = guitar;
	}

	public void playGuitar() {
		System.out.println("Rhythm guitarist strums the cords");

	}

}
