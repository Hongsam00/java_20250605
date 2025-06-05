/**
 * 파일명:MemberService.java<br/>
 * 생성일:2025-04-01 
 */
package com.pcwk.ehr.ex;

public class MemberService {

	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.printf("%s 님이 로그아웃 되었습니다.", id);
	}
	

}
