/**
 * 파일명:Animal.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ed13;

public abstract class Animal {
	
	//필드
	String name;

	//생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public void sleep() {
		System.out.println(name+"이(가) 잠을 잡니다.");
	}
	
	public void makeSound() {}
	
}
