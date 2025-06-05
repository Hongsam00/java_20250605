/**
 * 파일명:Ed01ShiftOperator.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed02;

public class Ed01ShiftOperator {

	public static void main(String[] args) {
		int x = 8;
		
		//8을 좌시프트 2한 결과
		int leftShift = x << 2;
		System.out.printf("%d 을 좌시프트 2한 결과:%d%n",x,leftShift);

	}

}
