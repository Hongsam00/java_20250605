package com.pcwk.ehr.ed02;
import java.util.*;
public class Ed02_Scanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("두 자리 정수를 입력 하세요 > ");
		
		int age = s.nextInt();
		System.out.printf("나이는 : %d %n", age-1);
	
		s.close();
	}

}
