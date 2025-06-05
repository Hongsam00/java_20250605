/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-03
 */
package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("오해원");
		Person p2 = new Person("오해원");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}

}
