/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * 파일명: Ed09SyncCounter.java <br/> 
 */
package com.pcwk.ehr.ed06;

public class Ed09SyncCounter {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};
		// Thread1

		// Thread2
		Thread thread01 = new Thread(task);
		Thread thread02 = new Thread(task);
		thread01.start();
		thread02.start();
		
		thread01.join();
		thread02.join();
		
		System.out.println("최종경과: " + counter.getCount());
	}

}
