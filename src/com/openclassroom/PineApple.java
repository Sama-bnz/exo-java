package com.openclassroom;

public class PineApple extends Fruit implements PeelFruit {
	/** Possibilité de proceder par une méthode pour ce qui concerne le boolean (ou pas voir classe kiwi)*/
	private boolean peeled = false; 

	public PineApple() {
		super("ananas");
	}

	@Override
	public void taste() {
		System.out.println("L'ananas as un gout légerement acide et sucré");
		
	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean isPeeled() {
		return peeled;
	}

	@Override
	public String getSkinType() {
		return "piquante";
	}

}
