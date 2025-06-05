/**
 * 파일명:MyClass.java<br/>
 * 생성일:2025-03-31<br/> 
 */
package com.pcwk.ehr.ed06;

public class MyClass {

	//인스턴스 변수
	int x;
	int y;
	
	//클래스 변수
	static int staticNum;
	
	//인스턴스 초기화 블럭
	{
		x = 14;
		y = 16;
		System.out.println("인스턴스 초기화 블럭");
	}
	
	static {
		staticNum = 88;
		System.out.println("클래스"
				+ " 초기화 블럭");
	}
	public MyClass() {
		System.out.println("Default생성자!");
		System.out.printf("x=%d, y%d",x ,y);
	}

}
