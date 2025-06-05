/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed14;

public class Main {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		//Vehicle객체: Bus, Taxi
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
