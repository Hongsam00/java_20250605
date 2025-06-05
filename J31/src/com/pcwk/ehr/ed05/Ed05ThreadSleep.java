/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * 파일명: Ed05ThreadSleep.java <br/> 
 */
package com.pcwk.ehr.ed05;

public class Ed05ThreadSleep {
	
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			System.out.println("5초 대기 시작..");
			try {
				Thread.sleep(5*1000);
				System.out.println("5초 후.");
			} catch (InterruptedException e) {
				System.out.println("InterruptedException 발생");
			}
		});
		//스레드 객체 생성(NEW) -> 실행대기(Runnable) -> 실행(RUNNING) 
		//-> 일시정지(sleep) -> 실행대기(Runnable) -> 종료(Terminated)
		
		t.start();
	}
}
