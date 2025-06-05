/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		Animal myAnimal;
		
		myAnimal = new Dog();
		myAnimal.sound();
		
		myAnimal = new Cat();
		myAnimal.sound();

	}

}
