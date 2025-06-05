/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 파일명: Alphabet.java <br/> 
 */
package com.pcwk.ehr.ed03;

public class Alphabet extends Thread {

	@Override
	public void run() {
		for(char ch='A'; ch<='I'; ch++) {
			System.out.println("Alphabet: " + ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
