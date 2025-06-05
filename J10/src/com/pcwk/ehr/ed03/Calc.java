/**
 * 파일명:Calc.java<br/>
 * 생성일:2025-03-31<br/> 
 */
package com.pcwk.ehr.ed03;

public class Calc {
	
	//클래스 메서드
	//접근 지정자 static return_type 함수이름(파라미터1, 파라미터2)
	public static int add(int x, int y){
		return x+y;
	}
	
	public int max(int x, int y) {
		if(x > y) {
			return x;
		} else {
			return y;
		}
	}
}
