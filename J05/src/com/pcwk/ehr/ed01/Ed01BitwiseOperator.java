/**
 * 파일명:Ed01BitwiseOperator.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed01;

public class Ed01BitwiseOperator {

	public static void main(String[] args) {
		int x = 42;
		String binaryString42 =Integer.toBinaryString(x);

		//System.out.println("binaryString42:"+binaryString42);
		//정수 42의 2진수 표현:
		System.out.printf("정수 %d의 2진수 표현:%s %n",x,binaryString42);
		
		int y = 51;
		String binaryString51 = Integer.toBinaryString(y);
		
		//정수 51의 2진수 표현:
		System.out.printf("정수 %d의 2진수 표현:%s%n",y,binaryString51);
		
		//AND(&)
		//정수 42 & 51 연산 결과:
		System.out.printf("정수 %d & %d :%d",x,y,(x&y));
	}

}
