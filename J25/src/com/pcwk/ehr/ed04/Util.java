/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 파일명 :Util.java
 */
package com.pcwk.ehr.ed04;

public class Util {
	
	//public static <T> 반환타입 메서드명(T 변수) {
	public static <T> void printArray(T[] array) {
		for(T item : array) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
