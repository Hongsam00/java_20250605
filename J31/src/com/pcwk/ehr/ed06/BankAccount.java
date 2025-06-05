/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * 파일명: BankAccount.java <br/> 
 */
package com.pcwk.ehr.ed06;

public class BankAccount {
	private int balance = 1000;
	
	public synchronized void withdraw(int amount) {
		if(balance >= amount) {
			System.out.println(Thread.currentThread().getName() + "가 출금 합니다.\n" + amount);
			
			balance -= amount;
			System.out.println("남은 잔액: " + balance);
		} else {
			System.out.println("잔액 부족: " + balance);
		}
	}
}
