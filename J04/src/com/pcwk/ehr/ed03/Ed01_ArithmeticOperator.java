/**
 * 파일명 : Ed01_ArithmeticOperator.java<br/>
 * 생성일 : 2025-03-21<br/>
 */
package com.pcwk.ehr.ed03;

public class Ed01_ArithmeticOperator {

	public static void main(String[] args) {
		int a = 14;
		int b = 16;
		
		//덧셈
		int sum = a + b;
		System.out.printf("%d + %d = %3d %n", a, b, sum);
		
		//뺄셈
		int difference = a - b;
		System.out.printf("%d - %d = %3d %n", a, b, difference);
		
		//곱셈
		int product = a * b;
		System.out.printf("%d * %d = %3d %n", a, b, product );
		
		//나눗셈 : int / int -> int
		a = 11;
		b = 2;
		System.out.printf("%d / %d = %d %n", a, b, (a/b));
		
		float c = 2.0f;
		System.out.printf("%d / %.1f = %.1f %n", a, c, (a/c)); //int/float -> float/float -> float
		
		//나머지 연산
		int remainger = a % b;
		System.out.printf("%d %% %d = %d%n",a ,b ,remainger);
	}

}
