package com.openclassroom;

public class Kiwi extends Fruit implements PeelFruit {

	public Kiwi() {
		super("kiwi");
	}

	@Override
	public void taste() {
		System.out.println("le kiwi est sucré");
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

	@Override
	public boolean isPeeled() {
		return true;
	}

	@Override
	public String getSkinType() {
		return "doux";
	}

}
