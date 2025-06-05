/**
 * 파일명:Ed01NestedWhile.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed01;

public class Ed01NestedWhile {

	public static void main(String[] args) {
		//구구단(2~9단)
		
		int dan = 2; //2단
		int limit = 12; //12단
		
		while(dan <= limit) {
			int i = 1; //곱해 지는 수(1~9)
			System.out.printf("%2d단%n",dan);
			
			while(i <=9) {
				//2 * 1 = 2
				//2 * 2 = 4
				//...
				//2 * 9 = 18
				
				System.out.printf("%d * %d = %2d%n",dan, i, (dan * i));
				i++;
			}
			
			System.out.println();
			dan++;
		}//while end

	}

}
