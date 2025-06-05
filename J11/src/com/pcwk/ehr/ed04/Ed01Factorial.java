/**
 * 파일명:Ed01Factorial.java<br/>
 * 생성일:2025-04-01 
 */
package com.pcwk.ehr.ed04;

public class Ed01Factorial {
	int i = 10;
	
	void newMethod() {
		
		System.out.println(i);
		
		if(i == 0) { //함수를 벗어 나는 조건 필요!
			return;
		}
		
		i--;
		newMethod();
	}
	
	public static void main(String[] args) {
		Ed01Factorial main = new Ed01Factorial();
		main.newMethod();

	}

}
