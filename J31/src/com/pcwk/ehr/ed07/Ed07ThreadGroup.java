/**
 * Package Name : com.pcwk.ehr.ed07 <br/>
 * 파일명: Ed07ThreadGroup.java <br/> 
 */
package com.pcwk.ehr.ed07;

public class Ed07ThreadGroup {

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("MyGroup");
		
		Runnable task = ()->{
			String name = Thread.currentThread().getName();
			System.out.println(name+" 시작!");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(name + " 인터럽트됨!");
			}
			
			System.out.println(name+" 종료!");
		};
		
		Thread t1 = new Thread(group, task, "스레드-1");
		Thread t2 = new Thread(group, task, "스레드-2");
		Thread t3 = new Thread(group, task, "스레드-3");

		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("스레드 그룹 이름: " +group.getName());
		System.out.println("활성 스레드 수: " + group.activeCount());
		
		//모든 스레드에 interrupt발생
		group.interrupt();
	}

}
