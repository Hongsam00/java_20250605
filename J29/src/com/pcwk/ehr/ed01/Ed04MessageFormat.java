/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명: Ed04MessageFormat.java <br/> 
 */
package com.pcwk.ehr.ed01;

import java.text.*;
import java.util.Date;

public class Ed04MessageFormat {

	public static void main(String[] args) {
		String pattern = "날짜: {0,date}, 시간: {0,time}, 금액: {1,number,currency}";
		
		Object[] arguments = {new Date(),12345678.9};
		
		String result = MessageFormat.format(pattern, arguments);
		//출력은 시스템 로케일 설정에 따라 달라질 수 있습니다.
		//출력: 날짜: 2025. 4. 29., 시간: 오전 10:10:35, 금액: ₩12,345,679
		System.out.println(result);
	}
}
