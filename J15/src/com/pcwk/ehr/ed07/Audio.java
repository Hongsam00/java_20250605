/**
 * 파일명:Audio.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed07;

/**
 * 
 */
public class Audio implements RemoteControl {

	private int volume;
	//볼륨기억
	private int memoryVolmue;
	
	public Audio() {
		super();
	}

	@Override
	public void turnOn() {
		System.out.println("Audid 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audid 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// MAX_VOLUME
		// MIN_VOLUME

		// 최대 볼륨보다 volume이 크면 volume최대 볼륨으로 설정
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		// 최소 볼륨보다 volume이 작으면 volume최소 볼륨으로 설정
		else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Audid볼륨은: " + this.volume);
	}

	//default 메서드 Overriding
	@Override
	public void setMute(boolean mute) {
		
		if(mute == true) {
			this.memoryVolmue = this.volume;
			System.out.println("음소거 합니다.");
			//추상 메서드 호출, 상수필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("음소거 해제 합니다.");
			setVolume(this.memoryVolmue);
		}
		
	}
	

}
