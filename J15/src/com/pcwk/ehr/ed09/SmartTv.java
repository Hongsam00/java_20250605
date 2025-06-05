/**
 * 파일명:SmartTv.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed09;

/**
 * 
 */
public class SmartTv implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");

	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

}
