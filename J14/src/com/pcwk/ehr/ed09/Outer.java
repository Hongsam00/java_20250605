/**
 * 파일명:Outer.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed09;

public class Outer {
	
	private String msg = "즐거운 금요일.";
	
	class Inner{
		
		void display() {
			System.out.println("내부 클래스 메시지: " + msg);
		}
	}
}
