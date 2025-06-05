/**
 * 파일명:Car.java<br/>
 * 생성일:2025-03-31<br/> 
 */
package com.pcwk.ehr.ed02;

public class Car {
	
	String model; //인스턴스 변수: 자동차 모델
	int speed; //인스턴스 변수: 자동차 속도
	
	static int totalCars = 0; //클래스 변수: 모든 Car 객체가 공유하는 변수
	
	//생성자 : 새로운 객체 생성 시 호출.
	public Car(String model, int speed) {
		this.model = model; //인스턴스 변수 초기화
		this.speed = speed;
		totalCars++;		//클래스 변수 : 자동차 수 증가
	}
	
	//인스턴스 메서드: 각 자동차의 정보를 출력
	public void displayInfo() {
		System.out.println("모델: " + model);
		System.out.println("속도: " + speed);
	}
	
	//클래스 메서드: 생성된 자동차(인스턴스)의 총 수를 출력
	public static void displayTotalCars() {
		System.out.println("자동차(인스턴스)의 총 수: " + totalCars);
	}
}
