/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명: Ed03MessageFormat.java <br/> 
 */
package com.pcwk.ehr.ed01;

import java.text.*;

public class Ed03MessageFormat {

	public static void main(String[] args) {
		String pattern = "안녕하세요, {0}님 오늘은 {1}입니다.";
		
		String result = MessageFormat.format(pattern, "이상무", "화요일");
		
		System.out.println(result);

	}

}
