/**
 * 파일명:Ed03NestedIfElseIfElse.java <br/>
 * 생성일:2025-03-25 <br/>
 */
package com.pcwk.ehr.ed03;

import java.util.Scanner;

public class Ed03NestedIfElseIfElse {

	public static void main(String[] args) {
		
		//변수
		int  score =   0;//성적
		char grade = ' ';//학점
		char plus  = ' ';//+
		
		//key board입력
		Scanner scanner=new Scanner(System.in);
		System.out.print("성적을 입력 하세요>");
		
		score = scanner.nextInt();
		System.out.printf("score=%d%n",score);

		if(score>=90) {
			grade = 'A';
			
			if(score>=95) {
				plus = '+';
			}else {
				plus = ' ';
			}
		}else if(score>=80) {
			grade = 'B';
			
			if(score>=85) {
				plus = '+';
			}			
		}else if(score>=70) {
			grade = 'C';
			
			if(score>=75) {
				plus = '+';
			}			
		}else if(score>=60) {
			grade = 'D';
			
			if(score>=65) {
				plus = '+';
			}			
		}else {
			grade = 'F';
		}
		
		System.out.printf("학점:%c%c",grade,plus);
		scanner.close();
	}

}
