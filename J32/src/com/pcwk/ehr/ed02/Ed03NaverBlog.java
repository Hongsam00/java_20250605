package com.pcwk.ehr.ed02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ed03NaverBlog {

	//return HttpURLConnection, connect(), param1 : String
	static HttpURLConnection connect(String apiURL) {
		
		try {
			URL url = new URL(apiURL);
			
			return (HttpURLConnection) url.openConnection();
		} catch (MalformedURLException e) {
			System.out.println("API URL이 잘못되었습니다." + e.getMessage());
			System.out.println("API URL: " + apiURL);
		} catch (IOException e) {
			System.out.println("연결 실패했습니다. :" + e.getMessage());
			System.out.println("API URL: " + apiURL);
		}
		
		return null;
	}
	//readBody(), return String, InputStream
	static String readBody(InputStream body) {
		InputStreamReader streamReader = new InputStreamReader(body);
		
		try(BufferedReader reader = new BufferedReader(streamReader)) {
			
			StringBuilder sb = new StringBuilder(2000);
			String data = "";
			while((data = reader.readLine())!=null) {
				sb.append(data).append("\n");
				
			}
			
			return sb.toString();
		} catch(IOException e) {
			System.out.println("API응답 읽기 실패: " +e.getMessage());
		}
		
		return "";
	}
	
	static String getNaverBlog(String apiURL, Map<String, String> requestHeader) {
		HttpURLConnection con = connect(apiURL);
		
		try {
			
			//요청 방식: get/post
			con.setRequestMethod("GET");
			
			for (Map.Entry<String, String> header : requestHeader.entrySet()) {
				con.setRequestProperty(header.getKey(), header.getValue());
				
			}
			
			int responsecode = con.getResponseCode();
			System.out.println("responsecode:" +responsecode);
			//성공
			if(responsecode == HttpURLConnection.HTTP_OK) {
				return readBody(con.getInputStream());
			//접속실패
			} else {
				
				
			}
			
		} catch(IOException e) {
			
		}finally {
			if(null != con) {
				con.disconnect();				
			}
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		
		String clientId = "V8FCnmaOyY6bRDPNYXCq";
		String clientSecret = "UPEykMgkYC";
		
		String text = "";
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("검색어를 입력하세요 > ");
			String input = s.next();
			
			text = URLEncoder.encode(input, "UTF-8");
//			System.out.println("text: " + text);
		} catch (UnsupportedEncodingException e) {
			System.out.println("검색어 인코딩 실패" + e.getMessage());
		}
		
		//JSON 
		//BLOG
		//String apiURL = "https://openapi.naver.com/v1/search/blog?query="+text+"&display=" +20;
		//NEWS
		String apiURL = "https://openapi.naver.com/v1/search/news.json?query="+text+"&display=" +20;
		//XML
		//String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+text;
		System.out.println(apiURL);
		
		Map<String, String> requestHeader = new HashMap<>();
		requestHeader.put("X-Naver-Client-Id", clientId);
		requestHeader.put("X-Naver-Client-Secret", clientSecret);
		
		String responseBody = getNaverBlog(apiURL, requestHeader);
		System.out.println(responseBody);
	}

}
