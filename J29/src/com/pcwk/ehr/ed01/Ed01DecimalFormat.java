/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명: Ed01DecimalFormat.java <br/> 
 */
package com.pcwk.ehr.ed01;

import java.text.*;

public class Ed01DecimalFormat {

	public static void main(String[] args) {
		double num = 12_345.6789d;
		
		//패턴 지정: 0,000.00
		DecimalFormat df = new DecimalFormat("0,000,000.00");
		//소숫점 2째 짜리에서 반올림
		System.out.println("0,000,000.00 -> "+df.format(num));
		
		//패턴지정: #,###.##
		df = new DecimalFormat("#,###,###.##");
		System.out.println("#,###,###.## -> "+df.format(num));
		
		//통화: ₩(원화)
		df = new DecimalFormat("\u00A4#,###.##");
		System.out.println("\u00A4#,###.## -> "+df.format(num));
		
		//$ 
		df = new DecimalFormat("$#,###.##");
		System.out.println("$#,###.## -> "+df.format(num));
	}

}
