/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {
		//업 캐스팅(자동 변환)
		Parent p = new Child();
		
		//자식 클래스의 show() 메서드
		p.show();
		
		//오류 발생
		//p.childMethod();
		
	}

}
