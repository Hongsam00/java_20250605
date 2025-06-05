/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed08;

public class Main {

	public static void main(String[] args) {
//		- static 으로 선언된 중첩 클래스
//		- 바깥 클래스의 인스턴스 없이 사용 가능
//		- 바깥 클래스의 static 멤버만 접근 가능.
		//인스턴스 생성
		Outer.StaticNested nested = new Outer.StaticNested();
		nested.display();

	}

}
