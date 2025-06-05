/**
 * 파일명:Ed04SwitchJDK12Yield.java <br/>
 * 생성일:2025-03-25 <br/>
 */
package com.pcwk.ehr.ed04;

public class Ed04SwitchJDK12Yield {

	public static void main(String[] args) {
		int score = 59;

		String grade = switch (score / 10) {
			case 10, 9 -> "A";
			case 8 -> "B";
			case 7 -> "C";
			case 6 -> "D";
			default -> {
				System.out.println("불합격");
				yield "F"; // 블록 내부에서 값 반환
			}
		};

		
		System.out.println("학점:"+grade);
	}

}
