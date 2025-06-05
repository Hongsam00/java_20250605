/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: Ed10Cal.java <br/> 
 */
package com.pcwk.ehr.ed02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Ed10Cal {

	// printCalendar(), return void, param1: year, param2: month

	public static void printCalendar(int year, int month) {
		// System.out.printf("year:%d month:%d%n", year, month);
//		시작일: 1
//		그 달의 총일수 : 28,29,30,31
//		시작 요일: 목

		// 시작일
		LocalDate firstDay = LocalDate.of(year, month, 1);
		// System.out.println("시작일: " + firstDay);
		// 시작 요일
		// MONDAY:1, SUNDAY:7
		DayOfWeek firstWeekDay = firstDay.getDayOfWeek();
		// System.out.println("시작요일: " + firstWeekDay);

		// [2025년 4월]
		// "월", "화", "수", "목", "금", "토", "일"
		System.out.printf("[%d년 %02d월]%n", year, month);
		String[] dayOfWeek = { "월", "화", "수", "목", "금", "토", "일" };

		// 요일 출력
		for (String week : dayOfWeek) {
			System.out.print(week + "\t");
		}
		System.out.println("\n──────────────────────────────────────────────────");

		// 시작 요일 : 공백
		int startDay = firstWeekDay.getValue();
		// System.out.println("시작요일: " + startDay);
		for (int i = 1; i < startDay; i++) {
			System.out.print("\t");
		}

		// 그 달에 총 일수
		int monthMaxLength = firstDay.lengthOfMonth();

		// 날짜 출력
		for (int day = 1; day <= monthMaxLength; day++) {
			System.out.printf("%d\t", day);
			
			//일요일 마다 줄바꿈: (day+요일-x)%7 == 0
			
			if(((day + startDay - 1)%7) == 0 ){
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		// 연도 입력 (예: 2025):
		// 월 입력 (예: 1~12):

		Scanner s = new Scanner(System.in);

		System.out.println("연도 입력 (예: 2025):");
		int year = s.nextInt();

		System.out.println("월 입력 (예: 1~12):");
		int month = s.nextInt();

		printCalendar(year, month);
	}

}
