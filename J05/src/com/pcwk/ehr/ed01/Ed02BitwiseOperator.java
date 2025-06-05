/**
 * 파일명:Ed02BitwiseOperator.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed01;

public class Ed02BitwiseOperator {

	public static void main(String[] args) {
		//양의 정수를 음의 정수 변환: 42 -> -42
		int x = 42;
		
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
