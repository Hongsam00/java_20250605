/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * 파일 명: Ed12Stream.java <br/>
 */
package com.pcwk.ehr.ed05;

import java.util.List;
import java.util.stream.*;

public class Ed12Stream {

	public static void main(String[] args) {
		// 숫자 리스트에서 홀수만 출력

		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7);
		
		//::는 메서드 참조(Method Reference) 연산자
		// 람다식을 더 간결하게 표현할 수 있도록 도와줍니다.
		
		nums.stream()
		.filter(n -> n%2 ==1)
		.forEach(System.out::println);
		//.forEach(n -> System.out.println(n));

	}

}
