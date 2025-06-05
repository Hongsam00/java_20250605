/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed05;

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
		
		System.out.println("==========================");
		
		//디폴트 메서드 호출
		rc.setMute(true);
		rc.setMute(false);
	}

}
