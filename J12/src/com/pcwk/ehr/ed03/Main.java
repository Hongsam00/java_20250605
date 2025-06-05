/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed03;
public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.name = "바둑이";
		dog.eat(); //부모 클래스의 메서드 사용
		dog.bark(); //자식 클래스에 추가된 메서드 사용
		
		System.out.println("-------------------------------");
		
		cat.name ="나비";
		cat.eat();
		cat.makeSound();
	}
}
