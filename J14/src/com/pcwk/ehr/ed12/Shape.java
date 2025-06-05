/**
 * 파일명:Shape.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ed12;

public sealed class Shape permits Circle, Rectangle, Triangle {
	
	
	public String name;
	
	public void showMessage() {
		System.out.println("도형 입니다.");
	}
}
