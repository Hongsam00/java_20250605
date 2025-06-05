/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: Ed08LocalTime.java <br/> 
 */
package com.pcwk.ehr.ed02;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ed08LocalTime {

	public static void main(String[] args) {
		// 현재 시간 생성
		LocalTime now = LocalTime.now();
		System.out.println("현재 시간 -> " + now);

		// 특정 시간 생성
		LocalTime specificTime = LocalTime.of(11, 50, 01);
		System.out.println("특정 시간 -> " + specificTime);

		// 문자열에서 시간을 파싱
		LocalTime parsedTime = LocalTime.parse("11:50:01");
		System.out.println("파싱된 시간 -> " + parsedTime);

		// 시간정보 가져오기
		System.out.println("시 -> " + now.getHour());
		System.out.println("분 -> " + now.getMinute());
		System.out.println("초 -> " + now.getSecond());
		System.out.println("나노초 -> " + now.getNano());

		// 포맷팅
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

		String forLocalTime = now.format(formatter);
		System.out.println("포맷 현재 시간 -> " + forLocalTime);
	}

}
