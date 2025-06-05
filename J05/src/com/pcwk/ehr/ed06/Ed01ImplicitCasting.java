/**
 * 파일명:Ed01ImplicitCasting.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed06;


public class Ed01ImplicitCasting {


	public static void main(String[] args) {
		int intValue = 100;
		double doubleValue = intValue;
		
		System.out.println("doubleValue:"+doubleValue);
		
		long longValue = 200L;
		float floatValue = longValue;
		System.out.println("floatValue:"+floatValue);

	}

}
