/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * 파일명: Ed06Threadjoin.java <br/> 
 */
package com.pcwk.ehr.ed05;

public class Ed06Threadjoin {

	public static void main(String[] args) throws InterruptedException {
		Thread worker = new Thread( ()-> {
			System.out.println("작업 스레드 실행");
			
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				
			}
			
			System.out.println("작업 스레드 종료");
		});
		
		worker.start();
		worker.join(); //main 스레드는 worker가 끝날 때까지 waiting상태
		System.out.println("main 스레드 종료");

	}

}
