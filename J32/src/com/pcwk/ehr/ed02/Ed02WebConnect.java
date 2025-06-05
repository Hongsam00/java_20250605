package com.pcwk.ehr.ed02;

import java.net.*;
import java.io.*;

public class Ed02WebConnect {

	public static void main(String[] args) {
//		String webURL = "https://www.google.com/";
		String webURL = "https://www.naver.com/";
		
		try {
			URL url = new URL(webURL);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String data = "";
			while( (data = in.readLine()) != null) {
				System.out.println(data);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
