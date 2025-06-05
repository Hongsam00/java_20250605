/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 파일명: Ed13Duration.java <br/> 
 */
package com.pcwk.ehr.ed03;

import java.time.*;

public class Ed13Duration {

	public static void main(String[] args) {
		// Duration 객체
		Duration durationM = Duration.ofMinutes(90); // 90분
		System.out.println("90분: " + durationM); // 90분 : PT1H30M

		Duration durationS = Duration.ofSeconds(3600); // 3600초(1시간)
		System.out.println("3600초: " + durationS); // PT1H

		// 두 시간 사이의 간격 계산
		LocalTime start = LocalTime.of(9, 0); // 09:00
		LocalTime end = LocalTime.of(11, 30); // 11:30

		Duration between = Duration.between(start, end);
		System.out.println("09:00 ~ 11:30 -> " + between); // PT2H30M
		
		//변환
		long hours = between.toHours();
		long minutes = between.toMinutes();
		
		System.out.println("시간: "+hours);
		System.out.println("분: "+minutes);
		
		//+연산
		Duration added = between.plus(Duration.ofMinutes(30));
		System.out.println("+30분: " + added);
		
		
		
	}
}
