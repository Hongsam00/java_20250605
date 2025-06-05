/**
 * 파일명 : Ed03LiteralSuffix.java <br/>
 * 작성자 : user <br/>
 * 작성일 : 2025-03-20 <br/>
 */
package com.pcwk.ehr.ed03;

public class Ed03LiteralSuffix {

	public static void main(String[] args) {
		//Type mismatch: cannot convert from long to int
		//int myAge = 23L;
		
		long myAge = 23L;
		
		
		double newAge = 23.5D; //double 리터럴 suffix
		float rate = 0.2f; //float 리터럴 suffix
		
		System.out.println("myAge : " + myAge);
		System.out.println("newAge : " + newAge);
		System.out.println("rate : " + rate);
		
	}

}
