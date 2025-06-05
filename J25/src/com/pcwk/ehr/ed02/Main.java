/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명 :Main.java
 */
package com.pcwk.ehr.ed02;

public class Main {
	
	public static void main(String[] args) {
		Box strBox = new Box();
		
		strBox.setItem("Apple");
		String message = (String)strBox.getItem();
		System.out.println(message);
		System.out.println("──────────────────────────────");
		
		Box intBox = new Box();
		intBox.setItem(22);
		
		int age = (int)intBox.getItem();
		System.out.println(age);
	}

}
