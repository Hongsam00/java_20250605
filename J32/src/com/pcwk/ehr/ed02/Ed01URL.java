package com.pcwk.ehr.ed02;

import java.net.*;

public class Ed01URL {

	public static void main(String[] args) {
		// 웹 주소 URL(Uniform Resource Locator)를 표현하고 조작하기 위한 클래스 입니다.
		// java.net 패키지에 포함되어 있습니다. 인터넷 자원 접근에 사용하는 도구 중 하나 입니다.

		String urlAddr = "https://nid.naver.com/user2/help/idInquiry?lang=ko_K#top";

		try {
			URL url = new URL(urlAddr);
			
			
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("호스트: " + url.getHost());
			System.out.println("포트: " + url.getPort());
			System.out.println("파일 경로: " + url.getPath());
			System.out.println("쿼리: " +url.getQuery());
			System.out.println("참조(앵커): "+ url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
