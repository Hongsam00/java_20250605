/**
 * 파일명:Formatter.java<br/>
 * 생성일:2025-04-01 
 */
package com.pcwk.ehr.ed02;

public class Formatter {

	public Formatter() {
		System.out.println("생성자");
	}

	public void format (int a, String b) {
		System.out.println("정수: " + a + ", 문자열: " +b);
	}
	
	public void format (String a, int b) {
		System.out.println("문자열: " + a + ", 정수: " +b);
	}
	
	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		formatter.format(26, "Java"); //출력: 정수:14, 문자열: Java
		formatter.format("자바", 25); //출력: 문자열: Java, 정수:35

	}

}
