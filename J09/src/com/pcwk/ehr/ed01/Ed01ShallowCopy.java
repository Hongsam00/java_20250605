/**
 * 파일명:Ed01ShallowCopy.java<br/>
 * 생성일:2025-03-28<br/>
 */
package com.pcwk.ehr.ed01;
import java.util.Arrays;
public class Ed01ShallowCopy {

	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5};
		int[] shallowCopy = original;
		
		original[1] = 100;
		
		System.out.println("original : " + Arrays.toString(original));
		System.out.println("shallowCopy : " + Arrays.toString(shallowCopy));
		System.out.println("==============");
		System.out.println("original : " + original);
		System.out.println("shallowCopy : " + shallowCopy);
	}

}
