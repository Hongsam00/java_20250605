/**
 * 파일명:Ex03.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ex;

public class Ex03 {

	public static void main(String[] args) {
		//3.  for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드를 작성해보세요.
		int sum = 0;
		
		for(int i = 1; i <=100 ; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
