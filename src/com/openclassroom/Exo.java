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
	
	public static void main (String[] args) {
		/**int nombre = 12;
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
	int loopLimit = 101;
	int iterations = 0;
	for (int i=5;i< loopLimit;i++) {
	    iterations += 1;
		}
	}
}
