/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 파일 명: Ed09Param.java <br/>
 */
package com.pcwk.ehr.ed04;

import java.util.function.Function;

public class Ed09Param {

	// 함수를 파라미터로 전달
	public static String applyFunc(String input, Function<String, String> func) {

		return func.apply(input);
	}

	public static void main(String[] args) {
		// 입력값 T를 받아서 결과값 R을 반환하는 함수.

		String message = applyFunc("hello", s -> s.toUpperCase());

		System.out.println("hello -> " + message);
	}

}
