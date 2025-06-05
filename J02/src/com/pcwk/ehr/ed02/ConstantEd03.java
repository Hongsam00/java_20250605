package com.pcwk.ehr.ed02;

public class ConstantEd03 {
	
	static final double DISCOUNT_RATE = 0.2; //할인율 20%
	
	public static void main(String[] args) {
		double originalPrice = 1000;
		//20% -> 80%지급
		double discountPrice = originalPrice * (1 - DISCOUNT_RATE);
		
		System.out.println("DISCOUNT_RATE : " + DISCOUNT_RATE);
		System.out.println("originalPrice : " + originalPrice);
		System.out.println("discountPrice : " + discountPrice);
	}

}
