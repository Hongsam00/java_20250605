/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일 명: Ed03RambdaExpression.java <br/>
 */
package com.pcwk.ehr.ed02;

public class Ed03RambdaExpression {

	public static void main(String[] args) {
		// 익명 함수
		Runnable runnable = () -> System.out.println("람다식(RambdaExpression)");
		// 호출
		runnable.run();

	}

}
