/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-01 
 */
package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		
		System.out.println(calc.add(23, 37));
		System.out.println(calc.add(14, 16, 17));
		System.out.println(calc.add(2.3, 4.7));

	}

}
