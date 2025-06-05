/**
 * 파일명:Ex05.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ex;

public class Ex05 {

	public static void main(String[] args) {
		/* 5. 중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y) 형태로 출력하는
		 * 코드를 작성해 보세요. 단, x와 y는 10이하의 자연수 입니다.
		 * */
		//1. for x (x<=10)
		//2. for y (y<=10)
		//3. 조건 4x + 5y == 60
		// 출력 : (x, y)
		for(int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				int result = (4 * x) + (5 * y);
				if(result == 60) {
					System.out.printf("(%2d, %2d)%n", x, y);	
				}
				
				
			}
		}
	}

}
