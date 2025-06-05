/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 파일 명: Ed11Predicate.java <br/>
 */
package com.pcwk.ehr.ed04;

import java.util.function.*;

public class Ed11Predicate {

	static void printIf(int num, Predicate<Integer> condition) {
		if (condition.test(num) == true) {
			System.out.println(num + "은(는) 조건을 만족 합니다.");
		} else {
			System.out.println(num + "은(는) 조건을 만족하지 않습니다.");
		}
	}

	public static void main(String[] args) {
		// 입력값 T를 받아서 true 혹은 false를반환하는 함수.()

		printIf(2, x -> x % 2 == 0);
		printIf(25, x -> x % 2 == 0);
	}

}
