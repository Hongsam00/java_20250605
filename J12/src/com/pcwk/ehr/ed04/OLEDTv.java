/**
 * 파일명:OLEDTv.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed04;

public class OLEDTv extends Tv {
	int brightness; //밝기
	
	//밝기 조절 메서드
	void adjustBrightness(int level) {
		this.brightness = level;
		
		System.out.println("밝기: "+brightness);
	}
}
