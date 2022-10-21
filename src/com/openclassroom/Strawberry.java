package com.openclassroom;

public class Strawberry extends Fruit {

	public Strawberry() {
		super("fraise");
		
	}

	@Override
	public void taste() {
		System.out.println("La fraise à un gout sucré");

	}

	@Override
	public int getSize() {
		
		return 1;
	}

	@Override
	public boolean hasSeed() {
		
		return false;
	}

}
