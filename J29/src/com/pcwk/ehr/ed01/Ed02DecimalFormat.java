/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명: Ed02DecimalFormat.java <br/> 
 */
package com.pcwk.ehr.ed01;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ed02DecimalFormat {

	public static void main(String[] args) throws ParseException {
		// df.parse("1,234.56"); //1234.56

		DecimalFormat df = new DecimalFormat("#,###.##");
		Number number = df.parse("1,234.56");
		System.out.println("1,234.56 -> " + number.doubleValue()); // 출력: 1234.56
	}

}
