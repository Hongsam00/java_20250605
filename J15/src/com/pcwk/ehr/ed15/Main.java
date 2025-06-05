/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed15;

public class Main {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		//Vehicle객체: Bus, Taxi
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		ride(bus);
		System.out.println("======================");
		ride(taxi);
	}
	
	public static void ride(Vehicle vehicle) {
		
		//Taxi
		if(vehicle instanceof Taxi) {
			
		}
		//방법1. Bus
		//Bus
//		if(vehicle instanceof Bus) {
//			((Bus) vehicle).checkFare();
//		}
		
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		vehicle.run();
	}

}
