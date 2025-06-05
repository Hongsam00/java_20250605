/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: Ed04CalendarAdd.java <br/>
 */
package com.pcwk.ehr.ed02;

import java.util.*;

public class Ed04CalendarAdd {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println("현재 날짜: " + cal.getTime());

		// 10일뒤 날짜
		cal.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("10일뒤 날짜: " + cal.getTime());

		// 1개월 전
		cal.add(Calendar.MONTH, -1);
		System.out.println("1개월 전 날짜: " + cal.getTime());
	}

}
