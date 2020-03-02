package com.iquestgroup.remotelearning;


import com.iquestgroup.remotelearning.interfaces.Drummer;
import com.iquestgroup.remotelearning.interfaces.Guitarist;

public class Band {

	private String bandName;
	private Drummer drummer;
	private Guitarist guitarist;

	public Band(String bandName, Drummer drummer, Guitarist guitarist) {
		this.bandName = bandName;
		this.drummer = drummer;
		this.guitarist = guitarist;
	}

	public void performConcert() {
		System.out.println("Band performs a concert");
	}

}
