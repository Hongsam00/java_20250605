/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 파일 명: Ed07Consumer.java <br/>
 */
package com.pcwk.ehr.ed04;

import java.util.function.Consumer;

public class Ed07Consumer {

	public static void main(String[] args) {
		// Consumer<T>{void accept(T t);}
		// 입력값 T를 받아서 처리만 하고 반환값은 없는 함수(출력)

		Consumer<String> printMessage = message -> System.out.printf("message: %s%n", message);

		printMessage.accept("오늘은 즐거운 목요일 전날!");
	}

}
