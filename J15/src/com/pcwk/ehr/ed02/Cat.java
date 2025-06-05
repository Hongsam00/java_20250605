/**
 * 파일명:Dog.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed02;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("야옹!");

	}

	@Override
	public void move() {
		System.out.println("고양이가 네 발로 달린다.");

	}

}
