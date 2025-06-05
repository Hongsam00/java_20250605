/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
		Parent p = new Parent(); //업캐스팅
		
		if (p instanceof Child) {
			Child c = (Child)p; //다운캐스팅(명시적 변환)
			c.childMethod(); //자식 클래스의 고유 childMethod()메서드
		}else {
			System.out.println("다운캐스팅 불가능 객체 입니다.");
		}
		
		
		
	}

}
