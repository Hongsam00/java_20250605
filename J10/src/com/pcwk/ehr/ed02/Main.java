/**
 * 파일명:Main.java<br/>
 * 생성일:2025-03-31<br/> 
 */
package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car("Tesla Model s", 200);
		Car yourCar = new Car("Genesis", 220);
		
		//인스턴스 메서드 호출: 인스턴스 변수 호출
		myCar.displayInfo();
		yourCar.displayInfo();
		
		System.out.println("=========================");
		//클래스 메서드 호출
		Car.displayTotalCars(); //자동차 (인스턴스)의 총 수: 2
	}

}
