/**
 * 파일명:Cat.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ed13;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(name + "야옹!");
	}
}
