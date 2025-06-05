/**
 * 파일명 : Ed03_UnaryOperator.java<br/>
 * 생성일 : 2025-03-21<br/>
 */
package com.pcwk.ehr.ed03;

public class Ed03_UnaryOperator {
	public static void main(String[] args) {
		//부호 연산자
		int a = 14;
		int b = -a;
		//System.out.printf("+a = %d | -a = %d",a , b);
		System.out.println("+a : " + (+a));
		System.out.println("-a : " + b);
		System.out.println("-------------------------");
		
		//논리 부정 연산자 (!)
		boolean flag = true;
		System.out.printf("flag  = %b%n",flag);
		System.out.printf("!flag = %b%n",!flag);
		
		//비트 NOT 연산자 (~) : 피연산자의 모든 비트를 반전 (0->1, 1->0)합니다.
		int c = 5; // 00000101
		System.out.println("~c : " + (~c)); //~c: -6
		System.out.println("-------------------------");
		
		//형변환 연산자: (타입)
		double d = 99.9;
		int i = (int)d;
		System.out.println("d : " + d);
		System.out.println("정수로 변환 값 : " + i);
		
	}

}
