/**
 * 파일명:Ed02.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed03;

public class Ed02 {

	public static void main(String[] args) {
		//1~10합
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum+=i; //sum = sum+i
			System.out.printf("%2d, sum : %2d%n",i ,sum);
		}
		
		System.out.println("합계 : " + sum);

	}

}
