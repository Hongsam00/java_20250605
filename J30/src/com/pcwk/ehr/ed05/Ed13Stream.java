/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * 파일 명: Ed13Stream.java <br/>
 */
package com.pcwk.ehr.ed05;

import java.util.*;
import java.util.stream.*;

public class Ed13Stream {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Oracle", "html", "css"
				, "JavaScript", "Spring", "Python"
				, "Pythone Flask", "ML");
		
		double avg = words.stream()
		.mapToInt(String::length) //문자열의 길이로 변환
		.average()				  //평균
		.orElse(0);				  //null이면 0 그렇지 않으면 해당 평균
		
		System.out.println("평균 길이: " + avg);
	}

}
