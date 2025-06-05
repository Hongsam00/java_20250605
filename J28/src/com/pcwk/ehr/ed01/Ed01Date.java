/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명: Ed01Date.java <br/>
 */
package com.pcwk.ehr.ed01;

import java.util.Date;

public class Ed01Date {

	public static void main(String[] args) {
		Date now = new Date(); // 날짜 + 시간
		System.out.println("현재 날짜 + 시간: " + now.toString());

		Date earlierDate = new Date(0);
		System.out.println("기준 시간: " + earlierDate.toString());

		System.out.println("현재 시간이 기준 시간 이전인가? " + now.before(earlierDate));
		System.out.println("현재 시간이 기준 시간 이후인가? " + now.after(earlierDate));
	}

}
