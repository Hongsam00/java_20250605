/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed05;

public class Main {
	public static void main(String[] args) {
		//Car 인스턴스 생성(엔진 포함)
		Car car = new Car("V6");
		
		car.startCar();
		System.out.println("-------------------");
		car.stopCar();
	}
}
