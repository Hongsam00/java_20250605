/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		Parent p = new Child(); //업캐스팅
		p.show(); //자식 클래스의 show() 메서드
		
		Child c = (Child)p; //다운캐스팅 (명시적 변환)
		c.childMethod(); //자식 클래스의 고유 childMethod() 메서드
		
		//--------------------------ClassCastException
		
		Parent p01 = new Parent();
		Child c01 = (Child) p01;
		
		c01.childMethod();
		
	}

}
