/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * 파일명: BankMain.java <br/> 
 */
package com.pcwk.ehr.ed06;

public class BankMain {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		Runnable task = () -> {
			account.withdraw(600);
		};
		
		Thread t01 = new Thread(task,"스레드1");
		Thread t02 = new Thread(task,"스레드2");
		
		t01.start();
		t02.start();
		
	}

}
