/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed11;

public class Main {
	
	public static void main(String[] args) {
		//구현 객체
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 변수
		A a;
		
		a = b; //A <- B (자동 타입 변환)
		a = c; //A <- C (자동 타입 변환)
		a = d; //A <- D (자동 타입 변환)
		a = e; //A <- E (자동 타입 변환)
	}
}
