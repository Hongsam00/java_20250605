/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: Ed09LocalDateTime.java <br/> 
 */
package com.pcwk.ehr.ed02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ed09LocalDateTime {

	public static void main(String[] args) {

		// 현재 날짜와 시간
		LocalDateTime now = LocalDateTime.now();

		System.out.println("현재 날짜와 시간 ->" + now);

		// 특정날짜와 시간 생성:
		LocalDateTime specificDateTime = LocalDateTime.of(2025, 9, 5, 7, 50, 1);
		System.out.println("특정날짜와 시간 -> " + specificDateTime);

		// 날짜, 시간정보 가져오기
		System.out.println("연도: " + now.getYear());
		System.out.println("월: " + now.getMonthValue());

		System.out.println("시간: " + now.getHour());

		// 문자열 파싱 : 2025-09-05T07:50:01
		LocalDateTime parsedDateTime = LocalDateTime.parse("2025-09-05T07:50:01");
		System.out.println(parsedDateTime);

		// 포맷팅
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatted = now.format(formatter);
		System.out.println("포맷팅: " + formatted);
	}

}
