/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 클래스명 : Main.java <br/> 
 */
package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		Day today = Day.THURSDAY;

		System.out.println("오늘은: " + today + "입니다.");
		System.out.println("오늘은: " + today.getKoreanName() + "입니다.");

		// switch

		switch (today) {

		case MONDAY:
			System.out.println(today.getKoreanName() + ": 한주의 시작입니다.");
			break;

		case THURSDAY:
			System.out.println(today.getKoreanName() + ": 즐거운 날입입니다.");
			break;
		}
	}

}
