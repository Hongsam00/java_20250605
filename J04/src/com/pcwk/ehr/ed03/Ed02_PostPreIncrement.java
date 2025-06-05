/**
 * 파일명 : Ed02_PostPreIncrement.java<br/>
 * 생성일 : 2025-03-21<br/>
 */
package com.pcwk.ehr.ed03;

public class Ed02_PostPreIncrement {

	public static void main(String[] args) {
		//전위 연산자
		int a = 14;
		int b = ++a;//a를 먼저 증가시키고, 그 값을 b에 대입
		System.out.printf("a = %d b = %d %n",a , b);
		System.out.println("=============");
		//후위 연산자
		a = 14;
		b = a++;
		System.out.printf("a = %d b = %d %n",a ,b);
		
		
	}

}
