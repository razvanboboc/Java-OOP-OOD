package com.iquestgroup.remotelearning.model;

import com.iquestgroup.remotelearning.interfaces.Guitarist;

public class BassGuitarist implements Guitarist {

	private Guitar guitar;

	public BassGuitarist(Guitar guitar) {
		this.guitar = guitar;
	}

	public void playGuitar() {
		System.out.println("Bass guitarist");
	}

}
