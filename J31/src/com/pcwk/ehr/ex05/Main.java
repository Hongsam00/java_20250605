package com.pcwk.ehr.ex05;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expression",
				"Java8 supports lambda expressions");
		//String API
		//filter : 중간 연산
		//forEach: 최종 연산
		list.stream()
		.filter(s -> s.toLowerCase().contains("java"))
		.forEach(System.out::println);
		

	}

}
