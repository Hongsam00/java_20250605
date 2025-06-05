/**
 * 파일명:Ed02BitwiseOperator.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed01;

import java.util.Scanner;

public class Ed03BitwiseOperators {

	public static void main(String[] args) {
		//양의 정수를 음의 정수 변환: 42 -> -42
		int x = 0;
		//정수를 키보드 입력 
		System.out.print("양의 정수를 입력 하세요>");
		Scanner sc=new Scanner(System.in);
		
		x = sc.nextInt();
		
		//비트 전환 연산
		int result = ~x;
		System.out.printf("양의 정수(초기값): %d%n",x);
		//42의 비트 전환 연산
		System.out.printf("%d의 비트 전환 연산 결과:%d%n",x,result);

		//42양수를 음수로 전환
		int finalResult = ~x + 1;
		System.out.printf("%d 양수를 음수로 전환: %d%n",x,finalResult);
	}

}
