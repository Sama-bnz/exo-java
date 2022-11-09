package com.openclassroom;

import java.util.Random;
import java.util.TimerTask;

public class CustomTimer extends TimerTask {

	private int time = 5;
	
	@Override
	public void run() {
		System.out.println("time : " + time );
		
		if(time == 5) {
			System.out.println("Nous sommes à la moitié du temps");
		}
		
		if(time == 0) {
			
			Random r = new Random();
			
			int alea = r.nextInt(6 - 1) + 1;
			System.out.println("valeur du dés : " + alea);
			
			cancel();
			System.out.println("Le temps est écoulé");
		}
		
		time--;
		
	}

}
