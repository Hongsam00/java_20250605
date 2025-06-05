/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * 파일 명: Ed17GroupingBy.java <br/>
 */
package com.pcwk.ehr.ed05;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ed17GroupingBy {

	public static void main(String[] args) {
		// 소문자 : 대문자로 변환 단축키 Ctrl + Shift + x
		List<String> names = Arrays.asList("JAVA", "ORACLE", 
				"HTML", "CSS", "JAVASCRIPT", "SPRING", 
				"PYTHON", "FLASK","ML");
		
		Map<Character, List<String>> grouped = names.stream()
		.collect(Collectors.groupingBy(word -> word.charAt(0)));
		//{P=[PYTHON], S=[SPRING], C=[CSS], F=[FLASK], 
		//H=[HTML], J=[JAVA, JAVASCRIPT], M=[ML], O=[ORACLE]}

		System.out.println(grouped);
	}

}
