/**
 * 파일명:Customer.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed07;

import com.pcwk.ehr.ed06.Coffee;

public class Customer {
	private int money; 			//고객이 가진 돈
	private int rewardPoints;   //적립금

	//14명 커피구매
	//구입 제품을 저장하기 위한 배열
	Coffee[] item = new Coffee[14];
	int i = 0; //배열 인덱스
	
	public Customer(int money) {
		super();
		this.money = money;
		this.rewardPoints = 0;
	}
	
	//주문 요약
	public void summary() {
		int sum = 0; //구매 총금액
		String itemList = ""; //구매목록
		
		for(int i = 0; i < item.length; i++) {
			//구입한 커피 만큼 반복문 처리
			if(null == item[i]) {
				break;
			}
			
			sum += item[i].getPrice();
			itemList += item[i].getName() + ", ";
		}
		System.out.println("구매 총 금액: " + sum + "원 입니다.");
		System.out.println("구매 목록: " + itemList + "입니다.");
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
		
		//Coffee 배열
		item[i++] = coffee;		
	}

	public int getMoney() {
		return money;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}
}
