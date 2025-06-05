/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-07 
 */
package com.pcwk.ehr.ed12;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//볼 수 없음
		//vehicel.checkFare();
		System.out.println("=======================");
		
		//강제 형변환
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}

}
