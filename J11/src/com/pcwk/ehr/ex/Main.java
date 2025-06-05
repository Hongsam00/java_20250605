/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-01 
 */
package com.pcwk.ehr.ex;

public class Main {

	public static void main(String[] args) {
		Member user1 = new Member("홍길동","hong");
		
		System.out.printf("이름: %s 아이디: %s%n", user1.name, user1.id);
		
		MemberService user2 = new MemberService();
		
		boolean result = user2.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			user2.logout("hong");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}

}
