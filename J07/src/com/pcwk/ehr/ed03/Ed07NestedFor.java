/**
 * 파일명:Ed07Nested.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed03;

public class Ed07NestedFor {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%d단%n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d%n", i, j, (i * j));
			}
			System.out.println("------------");
		}
	}
}
