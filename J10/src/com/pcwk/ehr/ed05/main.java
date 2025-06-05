/**
 * 파일명:main.java<br/>
 * 생성일:2025-03-31<br/> 
 */
package com.pcwk.ehr.ed05;

public class main {

	public static void main(String[] args) {
		Car defaultCar = new Car(); //Default생성자 호출
		defaultCar.displayInfo();
		
		System.out.println("===================================================");
		Car modelCar = new Car("Genesis");
		modelCar.displayInfo();
		
		System.out.println("===================================================");
		Car allParamCar = new Car("Genesis", "Blue", 2024);
		allParamCar.displayInfo();
	}

}
