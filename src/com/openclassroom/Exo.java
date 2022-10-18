package com.openclassroom;

/** Ceci est une implémentation du message traditionnel "Hello world!"
* @author L'équipe Education d'OpenClassrooms
*/


/**public class Exo {
	/*Le code commence ici
	
	private String name;
	private int age;
	private int salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		System.out.println("Bonjour tout le monde");
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}*/

public class Exo{
	
	/**public static void main (String[] args) {
		bonjour("Thomas");
		bonjour("Thomas");
		
		for(int i = 0; i <= 100; i++);{
		bonjour(Integer.toString(i));
		}
	}	
	static void bonjour(String nom) {
		System.out.println("Bonjour" + nom + "Comment allez vous aujourd'hui?");
	}*/
	
	/**public static void main (String[] args) {
		int i = 0;
		while(i <=50) {
			i = randomNumber();
			print(i);
		}
	}
	static void print(int nombre) {
		System.out.println("Nombre:" + Integer.toString(nombre));
		
	}
	static int randomNumber() {
		return(int) ((Math.random() * ((100 - 1) +1))+1);
	}*/
	
	/**public static void main (String[] args) {
		if(getBoolean()){
			console("vrai");	
		}else {
			console("faux");
		}
	}
	
	static void console(String text){
		System.out.println("Il es préférable d'etre dans le " + text + " si on veux avancer dans la vie, le contraire serait catastrophique!");
	}
	static boolean getBoolean() {
		return true;
	}*/
	
	/**public static void main (String[] args) {
		int nombre = 12;
		if(nombre ==1) {
			console("if 1");
		}else if(nombre ==2) {
			console("if 2");
		}else {
			console("rien ne correspond l'ami");
		}
		
		switch(nombre) {
			case 1:
				console("switch 1");
				break;
			default:
				console("default");
		}
	}
	static void console(String text){
		System.out.println(text);
	}*/
	/**public static void main (String[] args) {
		String[] names = {"Igor","Jean","Brice"};
		
		if(names[0]== names[1]) {
			System.out.println("C'est le meme prénom");
		}else {
			System.out.println("C'est n'es pas le meme prénom");
		}
		int[] numbers = {12,7,19};
		System.out.println(numbers.length);
		int calcul = (numbers[0] + numbers[1] + numbers[2] )/ numbers.length;
		System.out.println(calcul);
	}*/
	/**
	 * @param args
	 */
	/**public static void main (String[] args) {
		int[][] numbers = {
				{
					5,7,8
				},
				{
					3,2,1
				},
				{
					9,4,2
				}
		};
		
		System.out.println(numbers[2][1] + "<--");
	}
		String pseudoss = "Sheishounet, Wakz, Faker, PoissonFécond";
		String[] pseudos = pseudoss.split(",");
		int[] notes = {7, 20, 12, 2};
		
		int i = 0;
		
		while(i != 100 ) {
			i++;
			System.out.println("C'est la sauce " + i);
		}
		int calcul = 0;
	
		
		for(int i = 0; i< 10; i++) {
			System.out.println("Voila une boucle classique " + i);
		}
		for(int note : notes) {
			calcul = calcul + note;
		sendMessage("test");
		sendMessage("test Okayyyyyy");
		}
		
		
		private static void sendMessage(String message){
			System.out.println("Ceci est un message, oui " + message);
		}*/
	
	
	public static void main (String[] args) {
		
		Player player1 = new Player("Sama", 30.0, 200.0);
		System.out.println("nom du joueur : " + player1.getName());
		System.out.println("point de vie: "+player1.getHealth());
		

		
		
		Player player2 = new Player("Vicla", 24.0, 100.0);
		player2.setName("Foxone");
		player2.damage(player1.getAttack());
		System.out.println("nom du joueur : " + player2.getName());
		
	}
}

	
