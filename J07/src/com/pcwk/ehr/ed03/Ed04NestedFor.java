/**
 * 파일명:Ed04For.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed03;

public class Ed04NestedFor {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("**********");
		}
		System.out.println("======================");
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

	}

}
