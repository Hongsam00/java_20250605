/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-09
 */
package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount(50_000);
		System.out.println("---------------------");
		System.out.println("프로그램 시작");
		System.out.println("---------------------");
		
		try {
			bankAccount.withdraw(50_000 * 2);
		} catch (WithdrawException e) {
			System.out.println("WithDrawException: " + e.getMessage());
		}
		
		System.out.println("---------------------");
		System.out.println("프로그램 종료");
		System.out.println("---------------------");
	}

}
