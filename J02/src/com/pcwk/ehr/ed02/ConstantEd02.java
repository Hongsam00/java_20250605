package com.pcwk.ehr.ed02;

public class ConstantEd02 {
	
	static final double PI = 3.1415926535979; //원주율
	
	public static void main(String[] args) {
		
		double radius = 5;
		//원 넓이
		double area = PI * radius * radius;
		
		//가독성이 떨어짐.
		//double area = 3.14159265358979 * radius * radius;
		
		System.out.println("원 넓이는 : " + area);

	}

}
