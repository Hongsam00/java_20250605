/**
 * 파일명:Child.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed01;

public class Child extends Parent {
	int age;//자식 클래스 속성
	
	public void showAge() {//자식 클래스의 메서드
		System.out.printf("나이: %d%n", age);
		
	}
}
