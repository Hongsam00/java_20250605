/**
 * 파일명:Coffee.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed06;

/**
 * 
 */
public class Coffee {
	private int price;
	private int bonusPoint;
	
	public Coffee(int price) {
		super();
		this.price = price;
		this.bonusPoint = (int) (price/10.0); //10% 적립
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	public String getName() {
		return "일반 커피";
	}
}
