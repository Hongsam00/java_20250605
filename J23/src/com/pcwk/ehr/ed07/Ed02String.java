/**
 * 파일명:Ed02String.java <br/>
 * 생성일:2025-04-17 
 */
package com.pcwk.ehr.ed07;

public class Ed02String {

	public static void main(String[] args) {
		String csv = "Apple,Banana,Cherry";
		
		String[] fruits = csv.split(",");
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		String replaced = csv.replace("Banana", "Orange");
		
		System.out.println("replaced:"+replaced);
	}

}
