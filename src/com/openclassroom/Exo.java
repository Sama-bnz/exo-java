package com.openclassroom;

/** Ceci est une implémentation du message traditionnel "Hello world!"
* @author L'équipe Education d'OpenClassrooms
*/


public class Exo {
	/*Le code commence ici*/
	private String name;
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		System.out.println("Bonjour tout le monde");
	}
	
	public void setName(String name) {
		this.name= name;
	}
}
