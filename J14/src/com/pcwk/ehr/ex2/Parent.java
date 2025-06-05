/**
 * 파일명:Parent.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ex2;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
	
