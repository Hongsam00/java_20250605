package com.pcwk.ehr.ed08;

public class A3 {

	public static void main(String[] args) {
		//1+ (1+2) ...
		int answer = 0;
		
		for(int i = 1; i <= 10; i++) {
			int sum = 0;
			for(int j = 1; j <= i; j++) {
				sum += j;
			}
			answer += sum;
		}
		
		System.out.println("결과: " + answer);
	}

}
