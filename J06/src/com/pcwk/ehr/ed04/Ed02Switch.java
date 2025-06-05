/**
 * 파일명:Ed02Switch.java <br/>
 * 생성일:2025-03-25 <br/>
 */
package com.pcwk.ehr.ed04;

import java.util.Scanner;

public class Ed02Switch {

	public static void main(String[] args) {
		// 세로편집: alt+shift+a
		// 월을 입력 받아 분기 출력:
		// 1,2,3 → 1/4분기
		// 4,5,6 → 2/4분기
		// 7,8,9 → 3/4분기
		// 10,11,12 → 4/4분기

		int month = 0;// 월
		String quarter = "";// 분기

		Scanner scanner = new Scanner(System.in);
		System.out.printf("월을 입력 하세요>");
		month = scanner.nextInt();

		System.out.printf("월은 : %d%n", month);

		switch (month) {
		case 1:
		case 2:
		case 3:
			quarter = "1/4";
			break;
			
		case 4:
		case 5:
		case 6:
			quarter = "2/4";
			break;		
		case 7:
		case 8:
		case 9:
			quarter = "3/4";
			break;	
		case 10:
		case 11:
		case 12:
			quarter = "4/4";
			break;	
		}// switch end

		System.out.printf("%d월은 %s 분기 입니다.", month, quarter);

	}// --main end

}
