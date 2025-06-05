/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 파일 명: Main.java <br/>
 */
package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {

		PcwkOperation add = (a, b) -> a + b;
		PcwkOperation multiple = (a, b) -> a * b;

		// 람다식을 사용한 연산
		System.out.println("add: " + add.operation(18, 16));
		System.out.println("multiple: " + multiple.operation(12, 14));

	}

}
