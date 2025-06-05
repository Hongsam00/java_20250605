/**
 * 파일명:Member.java <br/>
 * 생성일:2025-04-17 
 */
package com.pcwk.ehr.ed04;

import java.io.*;

public class Member implements Serializable {

	private static final long serialVersionUID = -9190374815010977788L;
	
	private String name;
	private int age;

	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
