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
	
	public static void main (String[] args) {
		int i = 0;
		while(i <=90) {
			i = randomNumber();
			print(i);
		}
	}
	static void print(int nombre) {
		System.out.println("Nombre:" + Integer.toString(nombre));
		
	}
	static int randomNumber() {
		return(int) ((Math.random() * ((100 - 1) +1))+1);
	}
}
