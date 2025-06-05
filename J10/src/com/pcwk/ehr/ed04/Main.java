/**
 * 파일명:Main.java<br/>
 * 생성일:2025-03-31<br/> 
 */
package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		//기본 생성자
		Car carTesla = new Car();
		carTesla.displayInfo();
		
		//인스턴스 변수
		carTesla.model = "Genesis";
		System.out.println("carTesla.model: " + carTesla.model);
		
		//매개변수가 있는 생성자 호출
		Car carGenesis = new Car("TeslaNew Model Y", "Ultra Red", 2025);
		carGenesis.displayInfo();
		carGenesis.model = "Tesla New Model Y";
		System.out.println("carGenesis.model: " + carGenesis.model);
	}

}
