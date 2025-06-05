/**
 * 파일명:Tv.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed04;

public class Tv {
	boolean power; // 전원
	int channel; // 채널
	int volume; // 볼륨

	// alt+shift+S
	public Tv() {

	}

	// 전원 상태(on/off)
	void power() {
		power = !power;
		if (power == true) {
			System.out.println("Tv전원이 켜졌습니다.");
		} else {
			System.out.println("Tv전원이 꺼졌습니다.");
		}
	}

	// 채널 증가
	void channelUp() {
		channel++;
		System.out.println("채널: " + channel);
	}

	// 채널 감소
	void channelDown() {
		channel--;
		System.out.println("채널: " + channel);
	}

	// 채널 증가
	void volumeUp() {
		volume++;
		System.out.println("볼륨: " + volume);
	}

	// 채널 증가
	void volumeDown() {
		volume--;
		System.out.println("볼륨: " + volume);
	}
}
