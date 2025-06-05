/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * 파일명: Ed08Yield.java <br/> 
 */
package com.pcwk.ehr.ed05;

public class Ed08Yield {

	public static void main(String[] args) {
		
		Runnable task = ()-> {
			for(int i = 0; i<= 5; i++) {
				System.out.println(Thread.currentThread().getName()+": "+i);
				Thread.yield(); //다른 스레드에게 CPU 양보시도
			}
		};
		
		new Thread (task, "A").start();
		new Thread (task, "B").start();

	}

}
