/**
 * 파일명:Ed01Dowhile.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed02;

import java.util.Scanner;

public class Ed01Dowhile {

	public static void main(String[] args) {
		System.out.println("┌───────────────────────┐");
		System.out.println("│ 1. 메시지를 입력 하세요.    │");
		System.out.println("│ 2. q입력시 프로그램 종료.   │");
		System.out.println("└───────────────────────┘");
		
		String inputMessage = "";//입력 메시지
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.print(">");
			inputMessage = s.nextLine();
			
			System.out.printf("입력 메시지 : %s%n",inputMessage);
			System.out.println(inputMessage.equals("q"));
		}while(!inputMessage.equals("q"));
		System.out.println();
		System.out.println("┌───────────────────────┐");
		System.out.println("│ 프로그램 종료 !!!         │");
		System.out.println("└───────────────────────┘");
		
		s.close();
	}

}
