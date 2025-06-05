/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed10;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		Animal animal = dog;	
		animal.eat();
		
		System.out.println("========================");
		
		Pet pet = dog;
		pet.play();
		
		System.out.println("========================");
		
		DogInterface dogInter = dog;
		dogInter.bark();
	}

}
