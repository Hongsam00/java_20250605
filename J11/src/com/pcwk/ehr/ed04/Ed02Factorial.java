/**
 * 파일명:Ed02Factorial.java<br/>
 * 생성일:2025-04-01 
 */
package com.pcwk.ehr.ed04;

public class Ed02Factorial {

	public static int factorial(int n) {
		
		if(n == 1) {
			return n;
		}
		System.out.print(n + ",");
		//n! = n * (n - 1) * ... * 1;
		
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println();
		//5! = 120
		System.out.printf("%d! = %d%n", 5, result);
	}

}
