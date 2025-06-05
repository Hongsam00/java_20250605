/**
 * 파일명:Car.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed05;

public class Car {
	Engine engine;

	public Car(String engineType) {
		engine = new Engine(engineType);
	}
	
	public void startCar() {
		engine.start(); //엔진 ON
		System.out.println("자동차가 움직입니다.");
	}
	
	public void stopCar() {
		System.out.println("자동차가 멈춥니다.");
		engine.stop(); //엔진 OFF
	}
}
