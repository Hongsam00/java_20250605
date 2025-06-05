/**
 * 파일명:Bus.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed15;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");

	}
	
	//일반 메서드
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
