/**
 * 파일명:Dog.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed08;

public class Dog extends Animal{

	int age = 2;
	
	public Dog() {
		System.out.println("Dog() 생성자");
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍이가 짖습니다.");
		//System.out.println("age: " + age);
		
		//this.age : Dog멤버 age
		System.out.println("this.age: " + this.age);
		//super.age: Animal멤버 age
		System.out.println("super.age: "+ super.age);
		
		//Animal의 사운드
		super.sound();
	}

}
