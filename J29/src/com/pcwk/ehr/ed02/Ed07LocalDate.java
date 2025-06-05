/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: Ed07LocalDate.java <br/> 
 */
package com.pcwk.ehr.ed02;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ed07LocalDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		//임의 날짜 생성:
		LocalDate customDate = LocalDate.of(2025, 5, 2);
		
		//날짜 정보
		System.out.println("오늘: " + today);
		System.out.println("임의 날짜: " + customDate);
		
		//날짜 가져오기
		System.out.println("연도: " + customDate.getYear());
		System.out.println("월: " + customDate.getMonthValue());
		System.out.println("일: " + customDate.getDayOfMonth());
		System.out.println("요일: " + customDate.getDayOfWeek());
		
		//연산
		LocalDate nextDay = today.plusDays(3);
		System.out.println("3일 후: " + nextDay);
		
		//비교: 두 날짜를 비교
		System.out.println("customDate가 오늘 이전인가 ? " + customDate.isBefore(today));
		System.out.println("customDate가 오늘 이후인가 ? " + customDate.isAfter(today));
		
		//포맷팅
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		today.format(dtf);
	}

}
