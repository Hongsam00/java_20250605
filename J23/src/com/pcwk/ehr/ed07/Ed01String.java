/**
 * 파일명:Ed01String.java <br/>
 * 생성일:2025-04-17 
 */
package com.pcwk.ehr.ed07;

public class Ed01String {

	public static void main(String[] args) {
		String str = "Hello, Java!";
		System.out.println("Original:" + str);
		System.out.println("Length:" + str.length());
		System.out.println("Substring:" + str.substring(7, 11)); //출력:Java
		System.out.println("Contains:" + str.contains("Java")); //출력:Java
	}

}
