/**
 * 파일명:Person.java<br/>
 * 생성일:2025-03-31<br/> 
 */
package com.pcwk.ehr.ed03;

public class Person {
	String name; //이름
	int age; //나이
	
	public void sayHello() {
		//안녕하세요 나는 이상무이고, 나이는 살입니다.
		System.out.printf("안녕하세요 나는 %s이고, 나이는 %d살입니다.%n",name ,age);
	}
}
