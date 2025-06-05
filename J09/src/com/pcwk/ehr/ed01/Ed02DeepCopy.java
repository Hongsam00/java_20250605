/**
 * 파일명:Ed02DeepCopy.java<br/>
 * 생성일:2025-03-28<br/>
 */
package com.pcwk.ehr.ed01;

import java.util.Arrays;

public class Ed02DeepCopy {

	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5};
		int[] deepCopy = original.clone(); //깊은 복사
		
		original[1] = 200;
		
		System.out.println("original : " + original);
		System.out.println("deepCopy : " + deepCopy);
		System.out.println("=================");
		System.out.println("original : " + Arrays.toString(original));
		System.out.println("deepCopy : " + Arrays.toString(deepCopy));
		
	}

}
