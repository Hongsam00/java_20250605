/**
 * 파일명 : EscapeEd01.java <br/>
 * 작성자 : user <br/>
 * 작성일 : 2025-03-20 <br/>
 */
package com.pcwk.ehr.ed02;

public class EscapeEd01 {

	public static void main(String[] args) {
		System.out.println("좋은 \n아침 입니다."); //개행
		System.out.println("오늘은 즐거운 목요일 입니다\t."); //탭
		System.out.println("Hello\b World");
		System.out.println("내일은 더\b 즐거운 금요일 입니다."); //백스페이스
		System.out.println("내일은 더\r 즐거운 금요일 입니다."); //캐리지 리턴
		System.out.println("I love \'java\'"); //작은 따옴표
		System.out.println("\"I love java\""); //큰 따옴표
	
		System.out.println("D:\\JAP_20250317\\01_JAVA\\workspace"); //역슬래시
	}

}
