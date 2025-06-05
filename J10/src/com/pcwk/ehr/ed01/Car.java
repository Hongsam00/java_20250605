/**
 * 파일명:Car.java<br/>
 * 생성일:2025-03-31<br/> 
 */
package com.pcwk.ehr.ed01;

public class Car {
	//필드(속성)
	String brand; //자동차 브랜드
	int speed; //자동차 속도
	
	//메서드 (행동)
	void accelerate() { //속도 증가
		speed += 10;
		System.out.println(brand + "속도 : " + speed + "km/h");
	}
	
	void brake() { //속도 감소
		speed -= 10;
		System.out.println(brand + "속도 : " + speed + "km/h");
	}
}

