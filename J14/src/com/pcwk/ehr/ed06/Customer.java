/**
 * 파일명:Customer.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed06;

public class Customer {
	private int money; 			//고객이 가진 돈
	private int rewardPoints;   //적립금

	public Customer(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void buyCoffee(Coffee coffee) {
		if(this.money < coffee.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		//고객이 가진 돈에서 구입한 제품의 가격을 차감
		
		this.money -= coffee.getPrice();
		
		//적립금 할당: 10%적립
		this.rewardPoints += coffee.getBonusPoint();
		
		System.out.println(coffee.getName() + "을(를) 구입 했습니다.");
		
	}
	
}
