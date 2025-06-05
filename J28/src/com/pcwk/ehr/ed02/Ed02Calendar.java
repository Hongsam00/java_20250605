/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: Ed02Calendar.java <br/>
 */
package com.pcwk.ehr.ed02;

import java.util.Calendar;

public class Ed02Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println("현재 연도: " + cal.get(Calendar.YEAR));
		System.out.println("현재 월(1월->0): " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("현재 일: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("-----------------------------------------");
		System.out.println("현재 시간: " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("현재 분: " + cal.get(Calendar.MINUTE));
		System.out.println("현재 일: " + cal.get(Calendar.SECOND));
	}

}
