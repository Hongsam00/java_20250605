/**
 * 파일명:Tv.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed07;

/**
 * 
 */
public class Tv implements RemoteControl {

	private int volume;

	public Tv() {
		super();
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		//MAX_VOLUME
		//MIN_VOLUME
		
		//최대 볼륨보다 volume이 크면 volume최대 볼륨으로 설정
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; 
		}
		//최소 볼륨보다 volume이 작으면 volume최소 볼륨으로 설정
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV볼륨은: " + this.volume);
	}

}
