/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 파일명: Number.java <br/> 
 */
package com.pcwk.ehr.ed03;

public class Number extends Thread {

	@Override
	public void run() {
		for(int i=1; i<= 10; i++) {
			System.out.println("Number: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
