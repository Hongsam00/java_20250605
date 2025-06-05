/**
 * 파일명:Ed03StringArray.java<br/>
 * 생성일:2025-03-28<br/>
 */
package com.pcwk.ehr.ed01;

import java.util.Arrays;

public class Ed03StringArray {

	public static void main(String[] args) {
		String[] fruits = {"Apple", "Banana", "Mango"};
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.printf("fruits[%d] = %s%n", i, fruits[i]);
		}
		
		String tmp = fruits[2];
		System.out.println("tmp : " + tmp);
		
		fruits[1] = "딸기";
		System.out.println("fruits : " + Arrays.toString(fruits));
		
	}

}
