/**
 * 파일명:Ed04String.java<br/>
 * 생성일:2025-03-28<br/>
 */
package com.pcwk.ehr.ed01;

public class Ed04String {

	public static void main(String[] args) {
		String str1 = "Java"; //String Pool
		String str2 = "Java"; //같은 객체 참조

		String str3 = new String("Java"); //Heap 영역에 새로운 객체 생성
		
		System.out.printf("str1 == str2 => %b%n ", (str1 == str2));
		System.out.printf("str1 == str3 => %b%n ", (str1 == str3));
		
		//내용 비교는 equals();를 사용해야 합니다.
		System.out.printf("str1.equals(str3) => %b%n ", str1.equals(str3));

	}

}
