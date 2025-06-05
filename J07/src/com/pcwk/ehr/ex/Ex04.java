/**
 * 파일명:Ex05.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ex;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * 4. while 문과 math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을
		 * (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을
		 * 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 경우는 (1, 4), (4, 1), (2, 3), (3, 2)
		 * 입니다.
		 * 1. 첫 번째 주사위를 하나 굴린다.
		 * 2. 두 번째 주사위를 굴린다.
		 * 3. 두 수를 더해 == 5 비교 한다.
		 * 4. 일치하면 프로그램 종료, 그렇치 않으면 주사위를 또 굴린다.
		 */
		
		while(true) {
			int firstDice = (int)(Math.random() * 6) + 1;
			int secondeDice = (int)(Math.random() * 6) + 1;
			int sum = firstDice + secondeDice;
			
			System.out.printf("(%d, %d) = %2d%n", firstDice, secondeDice, sum);
			
			if(sum == 5) {
				break;
			}
			
		}
	}

}
