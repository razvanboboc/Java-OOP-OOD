package com.iquestgroup.remotelearning;

import com.iquestgroup.remotelearning.interfaces.Drummer;

public class JazzDrummer implements Drummer {

	private Drums drums;

	public JazzDrummer(Drums drums) {
		this.drums = drums;
	}

	public void playDrums() {
		System.out.println("Jazz drummer plays the drums");

	}

}
