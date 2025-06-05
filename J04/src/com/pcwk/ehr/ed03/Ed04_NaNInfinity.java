/**
 * 파일명 : Ed04_NaNInfinity.java<br/>
 * 생성일 : 2025-03-21<br/>
 */
package com.pcwk.ehr.ed03;

public class Ed04_NaNInfinity {

	public static void main(String[] args) {
		//정수 나눗셈
		int a = 10;
		int b = 0;
		
		System.out.printf("%d / %d = %d %n",a ,2 ,(a/2));
		
		//ArithmeticException : 0으로 나누면 (예외 발생)
		//System.out.printf("%d / %d = %d",a ,b ,(a/b));
		
		double x = 10.0;
		double y = 0.0;
		
		System.out.printf("%.1f / %.1f %n",x ,y);
		System.out.println("x / y = " + (x/y)); //x/y = Infinity
		x = -x;
		System.out.println("x / y = " + (x/y)); //x/y = -Infinity
		
		x = 0.0;
		System.out.println("x / y = " + (x/y)); //x/y = NaN
		
	}

}
