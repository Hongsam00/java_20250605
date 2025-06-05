/**
 * 파일명:Ed03ExplicitCasting.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed06;

public class Ed03ExplicitCasting {

	public static void main(String[] args) {
		double doubleValue = 100.5;
		System.out.println(doubleValue);//100.5
		
		int intValue = (int) doubleValue;
		//데이터 손실 발생!
		System.out.println(intValue);//100

	}

}
