package com.iquestgroup.remotelearning;


import com.iquestgroup.remotelearning.interfaces.Guitarist;

public class LeadGuitarist implements Guitarist {

	private Guitar guitar;

	public LeadGuitarist(Guitar guitar) {
		this.guitar = guitar;
	}

	public void playGuitar() {
		System.out.println("Lead guitarist strums the cords");
	}

}
