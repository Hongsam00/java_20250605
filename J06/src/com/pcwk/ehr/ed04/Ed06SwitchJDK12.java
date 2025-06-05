/**
 * 파일명:Ed06SwitchJDK12.java <br/>
 * 생성일:2025-03-25 <br/>
 */
package com.pcwk.ehr.ed04;


public class Ed06SwitchJDK12 {


	public static void main(String[] args) {
		int day = 1;
		
		String dayName=switch(day) {
		
			case 0 -> "월요일";	
			case 1 -> "화요일";
			case 2 -> "수요일";
			case 3 -> "목요일";
			case 4 -> "금요일";
			case 5 -> "토요일";
			case 6 -> "일요일";
			default -> "invalid value";	
		
		};

		System.out.printf("%d는 %s입니다.",day,dayName);
		
	}

}
