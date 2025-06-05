/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 파일 명: Ed05Function.java <br/>
 */
package com.pcwk.ehr.ed04;

import java.util.function.Function;

public class Ed05Function {

	public static void main(String[] args) {
		// Function<T, R>{ R apply(T t) }
		// 입력값 T를 받아서 결과값 R을 반환하는 함수.()

		//정수를 입력 받아 문자열로 return
		Function<Integer, String> intToString = num -> "Number:" + num;
		
		System.out.println(intToString.apply(19));
	}

}
