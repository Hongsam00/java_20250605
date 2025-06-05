/**
 * 파일명 : CharEd01.java <br/>
 * 작성자 : user <br/>
 * 작성일 : 2025-03-20 <br/>
 */
package com.pcwk.ehr.ed02;

public class CharEd01 {
	public static void main(String[] args) {
		char letter = 'A';
		System.out.println("letter : " + letter);
		
		//'A' 코드 값 확인
		System.out.println((int)letter);
		
		
		char letter01 = 65;
		System.out.println("letter01 : " + letter01);
		
		char number = '1';
		System.out.println("number : " + number);
		
		char number01 = 49;
		System.out.println("number01 : " + number01);
		
		char space = ' ';
		System.out.println("공백문자 : " + space);
		
		//한글
		char UnicodeGa = '\uAC00';
		System.out.println("UnicodeGa : " + UnicodeGa);
		
		char ga = '가';
		System.out.println("ga : " + ga);
	}
}
