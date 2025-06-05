/**
 * 파일명:Ed02Dowhile.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed02;

import java.util.Scanner;

public class Ed02Dowhile {

	public static void main(String[] args) {
		//1~100사이 숫자 맞추기
		
		Scanner s = new Scanner(System.in);
		
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		//0.0 <= x < 1.0   -> 100
		//0.0 <= x < 100.0 -> 정수로 변환
		//0   <= x < 100   -> 1 더하기
		//1   <= x < 101   
		//System.out.println(answer);
		
		do {
			System.out.println("1 ~ 100사이 숫자를 입력 하세요 >");
			input = s.nextInt();
			
			
			if(input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			else if(input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else {
				System.out.println("정답 입니다.");
			}
		}while(input != answer);
		
		
		System.out.printf("정답은 answer : %d 입니다.%n",answer);
		
		s.close();
	}

}
