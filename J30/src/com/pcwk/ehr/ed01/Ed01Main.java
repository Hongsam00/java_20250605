/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일 명: Ed01Main.java <br/>
 */
package com.pcwk.ehr.ed01;

import java.util.*;

public class Ed01Main {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(nums);

		// 리스트에서 짝수만 제곱해서 출력
		nums.stream()
		.filter(n -> n % 2 == 0)
		.map(n -> n * n)
		.forEach(System.out::println);
		
		

	}

}
