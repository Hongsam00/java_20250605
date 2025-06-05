package com.pcwk.ehr.ed02;

import java.util.Scanner;

public class Ed01_Scanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("오늘 요일은 어떻게 되나요? > ");
		String inputStr = s.nextLine();
		System.out.printf("오늘은 %s 입니다.", inputStr);
		
		s.close();
		}

}
