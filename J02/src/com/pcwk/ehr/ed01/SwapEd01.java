package com.pcwk.ehr.ed01;

public class SwapEd01 {

	public static void main(String[] args) {
		int strawberryCup = 5;
		int milkCup = 10;
		
		System.out.println("교환 전 데이터 strawberryCup : " + strawberryCup);
		System.out.println("교환 전 데이터 milkCup : " + milkCup );
		
		int emptyCup = 0; //임시 변수
		
		emptyCup = strawberryCup;  //임시 변수 : 5
		strawberryCup = milkCup;  //strawberryCup : 10
		milkCup = emptyCup;  //milkCup : 5
		
		System.out.println("교환 후 데이터 strawberryCup : " + strawberryCup);
		System.out.println("교환 후 데이터 milkCup : " + milkCup );
		
		
	}

}
