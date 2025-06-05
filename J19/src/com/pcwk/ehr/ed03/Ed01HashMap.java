/**
 * 파일명:Ed01HashMap.java<br/>
 * 생성일:2025-04-11
 */
package com.pcwk.ehr.ed03;

import java.util.*;

public class Ed01HashMap {

	public static void main(String[] args) {
		Map<String, String> capitals = new HashMap<String, String>();
		
		//대한민국: 서울 
		capitals.put("대한민국", "서울");
		capitals.put("일본", "도쿄");
		capitals.put("중국", "베이징");
		capitals.put("러시아", "모스크바");
		capitals.put("베트남", "하노이");
		
		//데이터 조회
		System.out.println("대한민국 수도: " + capitals.get("대한민국"));
		
		//키 존재 유무
		if(capitals.containsKey("러시아")) {
			System.out.println("러시아 수도: " + capitals.get("러시아"));
		} 
		
		//삭제
		System.out.println("삭제: " +capitals.remove("중국"));
		
		//전체 출력
//		Set<String> keys = capitals.keySet();
		Iterator<String> iter = capitals.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			//key: value
			System.out.printf("%s:%s%n",key,capitals.get(key));
		}
		System.out.println(capitals.entrySet());
	}

}
