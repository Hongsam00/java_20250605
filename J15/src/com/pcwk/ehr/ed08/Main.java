/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed08;

public class Main {

	public static void main(String[] args) {
		Service service = new ServiceImpl();
		service.defaultMethod01();
		
		System.out.println("=========================");
		Service.staticMethod01();
	}

}
