package com.pcwk.ehr.ex07;

import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동","개발자"),
				new Member("김나리","디자이너"),
				new Member("신용권","개발자"));
		
		List<Member> developer = list.stream()
									 .filter(s -> s.getJob().equals("개발자"))
									 .collect(Collectors.toList());
		developer.stream()
		.forEach(m -> System.out.println(m.getName()));
		
	}

}
