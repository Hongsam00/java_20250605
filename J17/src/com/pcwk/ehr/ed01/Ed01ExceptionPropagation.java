package com.pcwk.ehr.ed01;

public class Ed01ExceptionPropagation {

	public static void main(String[] args) {

		methodB(); //예외가 처리되지 않으면 main전파 됨
		
	}

	static void methodA() {

	}

	static void methodB() {
		int x = 5/0; //ArithmeticException 발생
	}
}
