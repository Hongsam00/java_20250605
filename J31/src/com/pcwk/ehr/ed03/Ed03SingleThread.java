/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 파일명: Ed03SingleThread.java <br/> 
 */
package com.pcwk.ehr.ed03;

public class Ed03SingleThread {
	
	public static void printAlphabets() {
		for(char ch='A'; ch<='I'; ch++) {
			System.out.println("Alphabet: " + ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void printNumbers() {
		for(int i=1; i<= 10; i++) {
			System.out.println("Number: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		//Task 1
		printAlphabets();
		
		//Task 2
		printNumbers();
	}
}
