/**
 * 파일명 : Ed01Boolean.java <br/>
 * 작성자 : user <br/>
 * 작성일 : 2025-03-20 <br/>
 */
package com.pcwk.ehr.ed05;

public class Ed01Boolean {

	public static void main(String[] args) {
		
		//boolean 변수 선언 및 초기화
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		
		//조건문
		if (isJavaFun) {
			System.out.println("자바는 재미 있어요.");
		}
		
		if (!isFishTasty) {//!false -> true
			System.out.println("생선은 맛있지 않아요.");
		}
		
		System.out.println("프로그램 종료!");
	}

}
