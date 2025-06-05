/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명 :Main.java
 */
package com.pcwk.ehr.ed03;

public class Main {
	
	public static void main(String[] args) {
		Box<String> strBox = new Box<String>();
		
		strBox.setItem("Apple");
		String message = strBox.getItem();
		System.out.println(message);
		System.out.println("──────────────────────────────");
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.setItem(22);
		
		int age = intBox.getItem();
		System.out.println(age);
	}

}
