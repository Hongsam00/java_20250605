/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: Main.java <br/> 
 */
package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);

		thread.start();
	}
}
