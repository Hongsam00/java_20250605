package com.pcwk.ehr.ed01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ed01InetAddress {

	public static void main(String[] args) {
		String hostName = "www.naver.com";
		
		try {
			InetAddress address = InetAddress.getByName(hostName);
			
			System.out.printf("IP주소: %s%n", address.getHostAddress());
			
			//모든 IP주소
			InetAddress[] ipArr = InetAddress.getAllByName(hostName);
			
			for(InetAddress ia : ipArr) {
				System.out.printf("IP주소: %s%n", ia.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
