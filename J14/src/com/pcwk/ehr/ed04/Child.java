/**
 * 파일명:Child.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed04;

public class Child extends Parent {

	@Override
	public void show() {
		System.out.println("자식 클래스의 show() 메서드");
	}
	
	public void childMethod() {
		System.out.println("자식 클래스의 고유 childMethod() 메서드");
	}

}
