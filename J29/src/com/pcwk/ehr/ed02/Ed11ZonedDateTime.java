/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: Ed11ZonedDateTime.java <br/> 
 */
package com.pcwk.ehr.ed02;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ed11ZonedDateTime {

	public static void main(String[] args) {
		//현재 날짜와 시간 + 시간대
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println("현재 날짜와 시간 + 시간대: " + now);
		
		//특정 시간대의 현재 날짜와 시간:
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간: " + zonedDateTime);
		
		//출력 포맷 지정
		ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		//z : 현재 시간의 타임존 약어 (KST, PST, UTC, GMT등)
		//W : 해당월의 주차(Week Of Month)
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z W");
		
		String formatted = zoned.format(formatter);
		System.out.println("포맷 시간:" + formatted);
	}

}
