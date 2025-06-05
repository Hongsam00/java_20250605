/**
 * 파일명:Ed03NamedBreak.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed04;

public class Ed03NamedBreak {

	public static void main(String[] args) {
		
		outter:for(char ch = 'A'; ch <= 'Z'; ch++) {
			
			System.out.print(ch + ", ");
			
			for(char num = '0'; num <= '9'; num++) {
				System.out.print(num);
				if(num == '3') {
					break outter;
				}
			}
			System.out.println();
			
		}

	}

}
