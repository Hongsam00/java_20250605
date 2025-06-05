/**
 * 파일명:Triangle.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ed12;

public sealed class Triangle extends Shape permits Square {
	//다시 봉인하여 Square만 허용

	@Override
	public void showMessage() {
		System.out.println("삼각형 입니다.");
	}
	
	
}
