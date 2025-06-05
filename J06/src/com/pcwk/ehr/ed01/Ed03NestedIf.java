/**
 * 파일명:Ed03NestedIf.java <br/>
 * 생성일:2025-03-25 <br/>
 */
package com.pcwk.ehr.ed01;

public class Ed03NestedIf {

	public static void main(String[] args) {
		
		int x = 16;
		//소스 정리: Ctrl+Shift+F
		if (x > 10) {

			if (x % 2 ==0) {
				//x는 10보다 크고, 짝수 입니다.
				System.out.printf("%d는 10보다 크고, 짝수 입니다.%n",x);
			}

		}

		System.out.println("프로그램 수행 완료!");
	}

}
