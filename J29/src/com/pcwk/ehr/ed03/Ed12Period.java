/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 파일명: Ed12Period.java <br/> 
 */
package com.pcwk.ehr.ed03;

import java.time.*;

public class Ed12Period {

	public static void main(String[] args) {
		//Period 객체 생성
		Period twoYear = Period.ofYears(2); //2년
		System.out.println("2년 간격: " + twoYear);
		
		Period threeMonth = Period.ofMonths(3); //3개월
		System.out.println("3개월 간격: " + threeMonth);
		
		Period combined = Period.of(1, 6, 15); //1년 6개월 15일
		System.out.println("1년 6개월 15일: " + combined);
		
		//두 날짜 간의 간격 계산
		LocalDate start = LocalDate.of(2024, 1, 1);
		LocalDate end = LocalDate.of(2025, 4, 29);
		
		Period between = Period.between(start, end);
		System.out.println("2024, 1, 1 ~ 2025, 4, 29: " + between);
		
		//각 단위 값 확인
		System.out.println("연도 차이: " + between.getYears());
		System.out.println("월 차이: " + between.getMonths());
		System.out.println("일 차이: " + between.getDays());
		
		//plus
		Period added = between.plus(Period.ofMonths(2));
		System.out.println("1년 3개월 28일 + 2개월: " + added);
		
		//minus
		Period subtracted = between.minus(Period.ofDays(10));
		System.out.println("1년 3개월 28일 - 10일: "+subtracted);
	}

}
