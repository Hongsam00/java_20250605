/**
 * 파일명:Ed04For.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed03;

public class Ed05NestedFor {

	public static void main(String[] args) {
		
		int numMax = 5;
				
		for(int i = 1; i <= numMax; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
