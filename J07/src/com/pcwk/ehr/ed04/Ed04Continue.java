/**
 * 파일명:Ed04Continue.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed04;

public class Ed04Continue {

	public static void main(String[] args) {
		//1~10 사이 홀수만 출력.
		
		for(int i = 1; i <=10 ; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
