/**
 * 파일명:Ed02NestedWhile.java<br/>
 * 생성일:2025-03-26<br/>
 */
package com.pcwk.ehr.ed01;

public class Ed02NestedWhile {

	public static void main(String[] args) {
		//(1+2) + (1+2+3)+ … + (1+2+3+ … + 10)
		
		int n = 1;
		int subTotal = 0; //중간 합계
		int totalSum = 0; //총합
		
		while(n <= 10) {
			int i = 1;
			subTotal = 0;
					
			while(i <= n) {
				if(i != n) {
					System.out.printf(i + ", ");
				}
				else{
					System.out.print(i);
				}
				subTotal += i;
				
				i++;
			} //while i end
			System.out.printf(" : " + subTotal);
			System.out.println();
			
			totalSum += subTotal;
			
			n++;
		} //while n end
		System.out.println("총합 : " + totalSum);
	}

}
