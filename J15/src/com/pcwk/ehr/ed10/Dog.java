/**
 * 파일명:Dog.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed10;

public class Dog implements Animal, Pet, DogInterface {

	@Override
	public void bark() {
		System.out.println("멍멍!");

	}

	@Override
	public void play() {
		System.out.println("개가 놉니다.");

	}

	@Override
	public void eat() {
		System.out.println("개가 밥을 먹습니다.");

	}

}
