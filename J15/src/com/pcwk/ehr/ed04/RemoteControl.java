/**
 * 파일명:RemoteControl.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed04;

public interface RemoteControl {
	int MAX_VOLUME = 10; //최대 볼륨
	int MIN_VOLUME = 0; //최소 볼륨
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
