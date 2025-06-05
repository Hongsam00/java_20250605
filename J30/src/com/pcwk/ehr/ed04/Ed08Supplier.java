/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 파일 명: Ed08Supplier.java <br/>
 */
package com.pcwk.ehr.ed04;

import java.util.function.Supplier;

public class Ed08Supplier {

	public static void main(String[] args) {
		// Supplier<T>{ T get();}
		// 매개변수 없이 값을 반환하는 함수

		Supplier<Double> randomDouble = () -> Math.random();

		System.out.println("Supplier<Double>: " + randomDouble.get());

	}

}
