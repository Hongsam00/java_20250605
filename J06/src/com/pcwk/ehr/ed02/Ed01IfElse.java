/**
 * 파일명:Ed01IfElse.java <br/>
 * 생성일:2025-03-25 <br/>
 */
package com.pcwk.ehr.ed02;


public class Ed01IfElse {


	public static void main(String[] args) {
		//짝수 홀수 판별 
		int x = 20;
		
		//if-else : 둘중 하나는 무조건 수행됨!
		if( x % 2 ==0 ) {
			//19는 짝수 입니다.
			System.out.printf("%d는 짝수 입니다.%n",x);
		}else {
			System.out.printf("%d는 홀수 입니다.%n",x);
		}
		
		

	}

}
