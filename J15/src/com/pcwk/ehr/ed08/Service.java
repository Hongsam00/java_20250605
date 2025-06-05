/**
 * 파일명:Service.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed08;

public interface Service {
	
	//디폴트 메서드
	default void defaultMethod01() {
		System.out.println("defaultMethod01() 종속코드");
		defaultCommon();
	}
	
	//정적 메서드
	static void staticMethod01() {
		System.out.println("staticMethod01() 종속코드");
		staticCommon();
	}
	
	//private 메서드
	private void defaultCommon() {
		System.out.println("defaultMethod A");
		System.out.println("defaultMethod B");
	}
	
	private static void staticCommon() {
		System.out.println("staticMethod A");
		System.out.println("staticMethod B");
	}
}
