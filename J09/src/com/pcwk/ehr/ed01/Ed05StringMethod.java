/**
 * 파일명:Ed05StringMethod.java<br/>
 * 생성일:2025-03-28<br/>
 */
package com.pcwk.ehr.ed01;

public class Ed05StringMethod {

	public static void main(String[] args) {
		String str = "Java";
		System.out.println(""+str.length());
		
		//charAt(index)
		System.out.println("charAt : " + str.charAt(0));
		
		//substring()
		str = "hamburger";
		System.out.println("substring() : " + str.substring(4, 8));
		System.out.println("substring() : " + str.substring(4));
		
		//indexOf()
		str = "Java Programming";
		System.out.println("indexOf() : " + str.indexOf("Pro"));
		
		//replace(old, new)
		str = "Java is fun";
		System.out.println(str.replace("a", "o"));
		
		//split() : 문자열 나누기
		str = "010-1234-5678";
		String[] fruits = str.split("-");
		
		//향상됨 for
		for(String fruit : fruits) {
			System.out.println(fruits);
		}
	}

}
