/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ed13;

public class Main {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		Dog dog = new Dog("바둑이");
		Cat cat = new Cat("나비");
		
		dog.sleep();
		dog.makeSound();
		
		cat.sleep();
		cat.makeSound();
	}

}
