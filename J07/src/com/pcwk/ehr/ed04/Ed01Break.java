/**
 * 파일명:Ed01Break.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed04;

public class Ed01Break {

	public static void main(String[] args) {
		
		int i = 0; //증가
		int sum = 0; //합계
		
		while(true) {	
			if(sum >= 88) {
				break;
			}
			++i;
			sum += i;
			System.out.printf("%d = %d%n", i, sum);
		}//while end

	}

}
