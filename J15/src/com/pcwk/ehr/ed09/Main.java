/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed09;

public class Main {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTv();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTv();
		searchable.search("https://www.notion.so/");

	}

}
