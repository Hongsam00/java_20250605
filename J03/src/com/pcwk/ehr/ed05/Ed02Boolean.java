/**
 * 파일명 : Ed02Boolean.java <br/>
 * 작성자 : user <br/>
 * 작성일 : 2025-03-20 <br/>
 */
package com.pcwk.ehr.ed05;

public class Ed02Boolean {

	public static void main(String[] args) {
		int x = 18;
		
		boolean result = (x == 20);
		System.out.printf("x = %d \n", x);
		System.out.printf("(x == 20) : %b \n", result);

		result = (x != 20);
		System.out.printf("(x != 20) : %b \n", result);
		
		result = (x > 20);
		System.out.printf("(x > 20) : %b", result);
	}

}
