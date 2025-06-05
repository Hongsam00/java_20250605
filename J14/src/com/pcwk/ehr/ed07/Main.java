/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed07;

import com.pcwk.ehr.ed06.Americano;
import com.pcwk.ehr.ed06.CaffeLatte;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer (100000); //10만원
		
		customer.buyCoffee(new Americano());
		customer.buyCoffee(new Americano());
		customer.buyCoffee(new Americano());//1900
		
		customer.buyCoffee(new CaffeLatte());
		customer.buyCoffee(new CaffeLatte());//2500
		
		customer.summary();
		
		System.out.println("현재 남은 잔고: " + customer.getMoney());
		System.out.println("보너스 포인트: "+ customer.getRewardPoints());
	}

}
