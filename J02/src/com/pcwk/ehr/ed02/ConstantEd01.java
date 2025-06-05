package com.pcwk.ehr.ed02;

public class ConstantEd01 {

	public static void main(String[] args) {
		//저장 : Ctrl + S
		
		// Undo : Ctrl + Z
		// Redo : Ctrl + Y
		//상수
		//상수 (Constatnt)란 프로그램에서 한 번 정의되면 값을 변경할 수 없는 변수를 의미 합니다.
		//상수는 프로그램에서 특정 값이 변하지 않음을 보장할 때 사용됩니다.
		
		final int MAX_AGE = 23;
		final String COMPANY_NAME = "PCWK";
	
		System.out.println("MAX_AGE : " + MAX_AGE);
		System.out.println("COMPANY_NAME : " + COMPANY_NAME);
		//상수 이므로 값 변경 불가.
		//MAX_AGE = 22; x
	}

}
