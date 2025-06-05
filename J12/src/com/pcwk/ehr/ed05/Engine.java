/**
 * 파일명:Engine.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed05;

public class Engine {
	String type; //엔진 type
	
	//Default생성자
	public Engine() {

	}
	
	public Engine(String type) {
		this.type = type;
	}


	void start() {
		System.out.println(type + "엔진 start!");
	}


	void stop() {
		System.out.println(type + "엔진 stop!");
	}
}
