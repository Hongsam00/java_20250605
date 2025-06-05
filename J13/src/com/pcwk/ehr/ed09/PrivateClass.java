/**
 * 파일명:PrivateClass.java<br/>
 * 생성일:2025-04-03
 */
package com.pcwk.ehr.ed09;

public class PrivateClass {
	private int num = 21; //private 변수
	
	private void show() {//private 메서드
		System.out.println("private 메서드 실행");
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	
}
