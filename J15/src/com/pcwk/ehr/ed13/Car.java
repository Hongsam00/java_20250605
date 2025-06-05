/**
 * 파일명:Car.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed13;

public class Car {
	
	//필드
	Tire tire1 = new HanKookTire();
	Tire tire2 = new KumhoTire();
	
	//메서드
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
