/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed04;

public class Main {
	//Crtl + Shift + X 모두 대문자
	//Crtl + Shift + Y 모두 소문자
	public static void main(String[] args) {
//		Tv tv = new Tv();
		SmartTv smartTv = new SmartTv();
		OLEDTv oledTv = new OLEDTv();
		
//		tv.power();
//		
//		System.out.println("------------------");
//		
//		tv.channelUp();
//		tv.channelDown();
//		
//		System.out.println("------------------");
//		
//		tv.volumeUp();
//		tv.volumeDown();
		
		System.out.println("------------------");
		
		smartTv.runApp("YouTube");
		smartTv.closeApp();
		
		System.out.println("------------------");
		
		oledTv.power();
		oledTv.adjustBrightness(4);
		oledTv.channelUp();
		oledTv.volumeUp();
		
	}
}
