/**
 * 파일명:Ed01AssignOperator.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed04;

public class Ed01AssignOperator {

	public static void main(String[] args) {
		int x = 3;
		System.out.printf("원본 x=%d%n",x);
		
		System.out.printf("x+=3 =>%d%n",(x+=3));
		
		x = 3;
		System.out.printf("x*=3 =>%d%n",(x*=3));	
		
		x = 5;
		System.out.printf("x&=3 =>%d%n",(x&=3));
		
		x = 5;
		System.out.printf("x<<=2 =>%d%n",(x<<=2));
	}

}
