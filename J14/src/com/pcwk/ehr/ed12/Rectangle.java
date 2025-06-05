/**
 * 파일명:Rectangle.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ed12;

public non-sealed class Rectangle extends Shape {
	//누구나 Rectangle을 확장 가능
	@Override
	public void showMessage() {
		System.out.println("사각형 입니다.");
	}
}
