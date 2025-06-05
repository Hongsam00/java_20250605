/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.sound();
		
		Animal myDog = new Dog(); //업캐스팅
		Animal myCat = new Cat();
		
		myDog.sound(); //dog에 sound()메서드 호출
		myCat.sound(); //dog에 sound()메서드 호출
		
	}

}
