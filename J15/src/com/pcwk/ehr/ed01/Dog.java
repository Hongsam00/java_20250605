/**
 * 파일명:Dog.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed01;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("멍멍!");

	}

	@Override
	public void move() {
		System.out.println("강아지가 네 발로 달린다.");

	}

}
