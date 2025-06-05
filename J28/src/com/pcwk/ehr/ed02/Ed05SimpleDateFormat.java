/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: Ed05SimpleDateFormat.java <br/>
 */
package com.pcwk.ehr.ed02;

import java.util.*;
import java.text.SimpleDateFormat;

public class Ed05SimpleDateFormat {

	public static void main(String[] args) {
		Date now = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd aHH:mm:ss");
		
		System.out.println("현재 날짜: " + sdf.format(now));
		
		//올해의 D번쨰 날
		sdf = new SimpleDateFormat("올해의 D번째 날");
		
		System.out.println("현재 날짜: " + sdf.format(now));

	}

}
