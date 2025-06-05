/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명 : Ed01WildCard.java <br/>
 */
package com.pcwk.ehr.ed01;

import java.util.List;

public class Ed01WildCard {

	// Unbounded Wildcard (?) : 제한이 없는 와일드 카드
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<String> stringList = List.of("A", "B", "C");
		List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7);

		printList(stringList);
		printList(intList);

	}

}
