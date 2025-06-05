/**
 * 파일명 : Ed01FloatingVar.java <br/>
 * 작성자 : user <br/>
 * 작성일 : 2025-03-20 <br/>
 */
package com.pcwk.ehr.ed04;

public class Ed01FloatingVar {

	public static void main(String[] args) {
		
		double a = 0.1;
		double b = 0.2;
		//부동 소수점 숫자는 근사값이므로 오차가 발생할 수 있다.
		//0.1, 0.2는 2진수로 정확히 표현되지 못해 내부적으로 반올림 오차가 발생하기 때문입니다.
		System.out.println(a+b); //0.30000000000000004
		
	}

}
