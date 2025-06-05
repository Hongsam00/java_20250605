/**
 * 파일명:Person.java<br/>
 * 생성일:2025-04-03
 */
package com.pcwk.ehr.ed01;

public class Person {
	
	String name;

	/**
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}
	
//	@Override
//	public String toString() {
//		return "Person 이름: " + name;
//	}
	
	@Override
	public String toString() {
		return "Person [name = " + name + "]";
	}
	
}
