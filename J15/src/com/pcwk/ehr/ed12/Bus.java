/**
 * 파일명:Bus.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed12;

public class Bus implements Vehicle {

	//추상 메서드 재정의
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	//추가 메서드
	public void checkFare() {
		System.out.println("승차 요금을 체크합니다.");
	}
}
