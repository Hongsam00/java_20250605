/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed06;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		animal.sound();
		System.out.println("=======================");
		
		//다형성
		Animal dog01 = new Dog();
		Animal cat01 = new Cat();
		
		dog01.sound(); //할당한 클래스 메서드 호출
		cat01.sound(); //할당한 클래스 메서드 호출
	}

}
