/**
 * 파일명:Ed01Varargs.java<br/>
 * 생성일:2025-04-01 
 */
package com.pcwk.ehr.ed03;

public class Ed01Varargs {
	
	public static int sum(int ...numbers) {
		int result = 0;
		
		for(int num : numbers) {
			result += num;
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(14, 16)); //출력 30
		System.out.println(sum(14, 16, 19)); //출력 49
		System.out.println(sum(14));
		System.out.println(sum());
	}

}
