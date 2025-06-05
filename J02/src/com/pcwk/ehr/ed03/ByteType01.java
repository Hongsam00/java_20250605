package com.pcwk.ehr.ed03;

public class ByteType01 {

	public static void main(String[] args) {
		//-127 ~ 127
		byte smallInteger = -128;
		
		System.out.println("smallInteger : " + smallInteger);

		smallInteger = 127;
		
		System.out.println("smallInteger : " + smallInteger);
		System.out.println("--------------------------------------");
		
		//값의 범위 -32,768 ~ 32767
		short shortVar = -32_768;
		System.out.print("shortVar : " + shortVar);
		
		shortVar = 32_767; //'_' 천 단위 구분 기호
		System.out.println(" ~ " + shortVar);
		
		System.out.println("--------------------------------------");
		//크기 : 4바이트(8 * 4 = 32bit)
		//값의 범위 -2,147,483,648 ~ 2,147,483,647
		//Find/Replace : Ctrl + F
		int intVar = -2_147_483_648;
		System.out.print("intVar : " + intVar);
		
		intVar = 2_147_483_647;
		System.out.println(" ~ " + intVar);
		System.out.println("--------------------------------------");
		
		//크기 : 8바이트(8 * 8 = 64bit)
		//값의 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long longNumber = -9_223_372_036_854_775_808L;
		System.out.print("longNumber : " + longNumber);
		longNumber = 9_223_372_036_854_775_807L;
		System.out.println(" ~ " + longNumber);
	}

}
