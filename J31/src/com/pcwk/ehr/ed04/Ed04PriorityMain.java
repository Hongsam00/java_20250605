/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 파일명: Ed04PriorityMain.java <br/> 
 */
package com.pcwk.ehr.ed04;

public class Ed04PriorityMain {

	public static void main(String[] args) {
		Thread high = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("high-");
			}
		});

		Thread low = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("low|");
			}
		});
		
		high.setPriority(Thread.MAX_PRIORITY);
		low.setPriority(Thread.MIN_PRIORITY);
		
		high.start();
		low.start();
	}

}
