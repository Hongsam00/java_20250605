/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * 파일명: Ed07Interrupt.java <br/> 
 */
package com.pcwk.ehr.ed05;

public class Ed07Interrupt {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(()-> {
			System.out.println("작업 시작, 5초대기");
			try {
				Thread.sleep(5*1000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException:" + e.getMessage());
			}
			System.out.println("작업 후 완료");
		});
		t.start();
		Thread.sleep(1000);//1초
		t.interrupt(); //인터럽트 요청 -> sleep중 예외 발생
		
	}

}
