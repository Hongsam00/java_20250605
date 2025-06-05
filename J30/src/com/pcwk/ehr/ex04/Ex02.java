/**
 * Package Name : com.pcwk.ehr.ex04 <br/>
 * 파일 명: Ex02.java <br/>
 */
package com.pcwk.ehr.ex04;

public class Ex02 {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("작업 스레드가 실행됩니다.");
			}
		});
		thread.start();

	}

}
