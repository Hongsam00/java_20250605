/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed13;

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		System.out.println("--------------------------------");
		
		//타이어 교체
		car.tire1 = new KumhoTire();
		car.tire2 = new KumhoTire();
		
		car.run();
	}
}
