/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 클래스명 : Main.java <br/> 
 */
package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		Member member = new Member("hong", "홍길동");
		
		System.out.println(member.id());
		System.out.println(member.name());
		
		System.out.println(member.toString());
	}

}
