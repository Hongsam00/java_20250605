/**
 * 파일명:Child.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ex2;

public class Child extends Parent {
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
