/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-01 
 */
package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
		//인스턴스 생성1
		CustomerClass customer01 = new CustomerClass();
		customer01.displayInfo();
		customer01.age = 22;
		customer01.displayInfo();
		
		//인스턴스 생성2
		CustomerClass customer02 = new CustomerClass();
		customer02.displayInfo();
		//인스턴스 변수 접근
		
		//인스턴스 생성3
		CustomerClass customer03 = new CustomerClass("PCWK",22);
		customer03.displayInfo();
		
		System.out.println("=============================");
		
		//클래스 메서드
		CustomerClass.staticDisplayInfo();
		
		//클래스 변수 호출
		System.out.println("CustomerClass.serialNo: "+CustomerClass.serialNo);
		CustomerClass.serialNo = 99;
		CustomerClass.staticDisplayInfo();
	}

}
