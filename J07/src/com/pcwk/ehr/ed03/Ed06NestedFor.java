/**
 * 파일명:Ed06NestedFor.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed03;

public class Ed06NestedFor {

	public static void main(String[] args) {
		int numMax = 5;
		int numMin = 1;
		
		for(int i = numMax; i >= numMin; i--) {
			for(int j = numMin; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
