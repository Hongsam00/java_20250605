/**
 * Package Name : com.pcwk.ehr.ed08 <br/>
 * 파일명: Main.java <br/> 
 */
package com.pcwk.ehr.ed08;

public class Main {

	public static void main(String[] args) {
		AutoSave autoSave = new AutoSave();
		autoSave.setDaemon(true);
		
		autoSave.start();
		
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("프로그램 종료");
	}

}
