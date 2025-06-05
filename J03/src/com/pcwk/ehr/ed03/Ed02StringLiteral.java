/**
 * 파일명 : Ed02StringLiteral.java <br/>
 * 작성자 : user <br/>
 * 작성일 : 2025-03-20 <br/>
 */
package com.pcwk.ehr.ed03;

public class Ed02StringLiteral {

	public static void main(String[] args) {
		String multiLineString = """
		오늘은 즐거운 목요일 입니다.
		그리고 내일은 더~~ 즐거운 금요일 입니다.
		""";
		
		System.out.println(multiLineString);
		
		String oldMultiLineString = "오늘은 즐거운 목요일 입니다.\n그리고 내일은 더~~ 즐거운 금요일 입니다.";
		
		System.out.println(oldMultiLineString);
		
		System.out.println("---------------------------");
		
		boolean isTrue = true; //참
		boolean isFalse = false; //거짓
		
		String nothing = null;
		System.out.println("nothing : " + nothing);
		
	}

}
