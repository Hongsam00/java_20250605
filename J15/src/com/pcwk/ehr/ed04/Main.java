/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		
		RemoteControl rc;
		
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
		
		System.out.println("==========================");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();
		
	}

}
