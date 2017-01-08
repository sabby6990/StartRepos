package designpattern.factory;

import java.util.Scanner;

public class StarWarsFactoryRunner {
	public static void main(String[] args) {
		
		StarWarsFactory factory = new StarWarsFactory();
		
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		Villian villian =factory.createEnemy(input);
		StarWarsFactoryRunner.displayEnemy(villian);
		
	}
	
	static void displayEnemy(Villian villian){
		System.out.println("Luke skywalker is facing "+villian.getName());
		System.out.println("with strength "+villian.getStrength());
	}
}
