/**
 * 파일명:Main.java<br/>
 * 생성일:2025-03-31<br/> 
 */
package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		
		//객체 생성
		Car myCar = new Car();
		
		//필드 값 설정
		myCar.brand = "Tesla";
		myCar.speed = 50;
		
		//메서드 호출
		myCar.accelerate();
		myCar.brake();
	}

}