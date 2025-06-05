/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 클래스명 : Main.java <br/> 
 */
package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		//열거형 사용
		Day today = Day.THURSDAY;
		
		System.out.println("오늘은: "+ today + "입니다.");
		
		//열거형 값 비교
		if(today == Day.THURSDAY) {
			System.out.println("오늘은 목요일 입니다.");
		}

		//모든 열거형 값 순회
		for(Day day : Day.values()) {
			System.out.println(day);
		}
	}

}
