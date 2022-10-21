package com.openclassroom;

/** Attention une enumération n'est pas une classe!!*/

public enum Day {
	
	MATIN(8, "Il est l'heure de se lever"),
	MIDI(12, "A table bon appétit"),
	APRESMIDI(15, "Bon foot"),
	SOIR(22, "Bonne nuit"),
	NUIT(2, "Fais de beaux rêves");
	
	private int hour;
	private String message;
	
	Day(int hour, String message){
		this.hour = hour;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getHour() {
		return hour;
	}
}
