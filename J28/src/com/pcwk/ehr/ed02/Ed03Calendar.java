/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: Ed02Calendar.java <br/>
 */
package com.pcwk.ehr.ed02;

import java.util.Calendar;

public class Ed03Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		//2025년 09월 05일 설정
		cal.set(2025, Calendar.SEPTEMBER, 5);
		
		System.out.println("설정된 날짜: " +cal.getTime());
	}

}
