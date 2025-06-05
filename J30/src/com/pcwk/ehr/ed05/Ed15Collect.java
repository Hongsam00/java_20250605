/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * 파일 명: Ed13Stream.java <br/>
 */
package com.pcwk.ehr.ed05;

import java.util.*;
import java.util.stream.Collectors;

public class Ed15Collect {

	public static void main(String[] args) {
		//T로 시작하는 사람 찾기
		List<String> names = List.of("Tom", "Jerry", "Tim", "Alice");
		
		List<String> filtered = names.stream()
								.filter(n -> n.startsWith("T"))
								.collect(Collectors.toList());
		
		System.out.println(filtered);
	}

}
