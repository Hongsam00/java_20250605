/**
 * 파일명:Ed02IfElseIfElse.java <br/>
 * 생성일:2025-03-25 <br/>
 */
package com.pcwk.ehr.ed03;

import java.util.Scanner;

public class Ed02IfElseIfElse {


	public static void main(String[] args) {
		int score = 0;
		
		//키보드를 통한 성적 입력
		Scanner scanner=new Scanner(System.in);
		System.out.print("성적을 입력 하세요>");
		score = scanner.nextInt();
		System.out.printf("score=%d%n",score);
		
		
		if(score >=90) {
			System.out.println("A 등급 입니다.");
		}else if(score >=80) {
			System.out.println("B 등급 입니다.");
		}else if(score >=70) {
			System.out.println("C 등급 입니다.");
		}else if(score >=60) {
			System.out.println("D 등급 입니다.");
		}else {
			System.out.println("F 등급 입니다.");
		}
		scanner.close();

	}

}
