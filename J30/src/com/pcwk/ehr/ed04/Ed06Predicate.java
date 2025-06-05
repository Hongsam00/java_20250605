/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 파일 명: Ed06Predicate.java <br/>
 */
package com.pcwk.ehr.ed04;

import java.util.function.Predicate;

public class Ed06Predicate {

	public static void main(String[] args) {
		// Predicate<T>{Boolean test(T t); }
		// 입력값 T를 받아서 true 혹은 false를반환하는 함수.()

		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println(isEven.test(19));
		System.out.println(isEven.test(16));
	}
}
