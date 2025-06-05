/**
 * 파일명:RemoteControl.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed05;

public interface RemoteControl {
	int MAX_VOLUME = 10; //최대 볼륨
	int MIN_VOLUME = 0; //최소 볼륨
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메서드
	default void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("음소거 합니다.");
			//추상 메서드 호출, 상수필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("음소거 해제 합니다.");
		}
	}
}
