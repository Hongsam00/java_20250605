/**
 * 파일명:Account.java<br/>
 * 생성일:2025-04-01 
 */
package com.pcwk.ehr.ex4;

public class Account {
	
	private int balance; //잔고

	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1_000_000;
	
	//Getter
	public int getBalance() {
		return balance;
	}
	
	//Setter
	public void setBalance(int balance) {
		//0 <= balance <= 1_000_000
		if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
			System.out.println("balance: "+balance);
			return;
		}
		
		this.balance = balance;
	}
	
}
