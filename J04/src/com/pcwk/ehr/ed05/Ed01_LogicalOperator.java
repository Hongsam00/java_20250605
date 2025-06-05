/**
 * 파일명 : Ed01_LogicalOperator.java<br/>
 * 생성일 : 2025-03-21<br/>
 */
package com.pcwk.ehr.ed05;

public class Ed01_LogicalOperator {

	public static void main(String[] args) {
		int iValue = 6;
		
		//2의 배수
		boolean result = (iValue % 2 == 0);
		System.out.printf("result : %b%n", result);
		
		//3의 배수
		result = (iValue % 3 == 0);
		System.out.printf("result : %b%n", result);
		
		//2 그리고 3의 배수
		result = ((iValue % 2 == 0) && (iValue % 3 == 0));
		System.out.printf("result : %b%n", result);
		
		int charCode = 'A';
		//대문자 인지 확인 : ASCII코드
		//대문자 A : 65, Z : 90
		System.out.printf("charCode : %d %n", charCode);
		
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자 입니다.");
		}
		
		charCode = 'a';
		//소문자 a : 97, z : 122
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 입니다.");
		}
	}

}
