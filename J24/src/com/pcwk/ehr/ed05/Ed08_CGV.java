package com.pcwk.ehr.ed05;

import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ed08_CGV {

	static final String CGV = "http://www.cgv.co.kr/movies/?lt=1&ft=0";
	static final int MOVIES = 19;

	/**
	 * CGV 무비차트 크롤링
	 * 
	 * @param cgvUrl
	 * @param moviesCount
	 */
	static void crawler(String cgvUrl, int moviesCount) {
//		System.out.println("cgvUrl:"+cgvUrl);
//		System.out.println("moviesCount:"+moviesCount);

		try {
			Document doc = Jsoup.connect(cgvUrl).get();
//			System.out.println(doc);

			// 영화 제목
			Elements titles = doc.select("div.box-contents strong.title");
			
			//예매율
			Elements scores = doc.select("div.box-contents div.score strong.percent span");
			
			//이미지
			Elements posters = doc.select("div.box-image span.thumb-image img");
			
			for (int i = 0; i < moviesCount; i++) {
				Element titleElement = titles.get(i);
				Element scoreElement = scores.get(i);
				
				//titleElement.toString() : html
				//titleElement.text()
				//<img src='포스트 URL'> 차기
				String postURL = posters.get(i).attr("src");
				System.out.printf("제목:%3d. %-30s 예매율: %5s 포스터:%s%n", (i+1), titleElement.text(),scoreElement.text(),postURL);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		crawler(CGV, MOVIES);

	}

}
