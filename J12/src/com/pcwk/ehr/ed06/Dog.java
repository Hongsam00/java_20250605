/**
 * 파일명:Dog.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed06;

public class Dog extends Animal {
	
	public Dog() {
		
	}
	
	@Override
	public void sound() {
//		super.sound();
		System.out.println("개가 멍멍 짖습니다.");
	}
}
