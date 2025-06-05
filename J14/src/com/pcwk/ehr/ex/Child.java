/**
 * 파일명:Child.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ex;

public class Child extends Parent {
	
	public int studentNo;

	public Child(String name, int studentNo) {

		super.name = name;
		this.studentNo = studentNo;
	}
}
