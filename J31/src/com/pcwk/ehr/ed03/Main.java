/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 파일명: Main.java <br/> 
 */
package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {
		//Alphabet 스레드
		Alphabet alphabet = new Alphabet();
		
		//Number 스레드
		Number number = new Number();
		
		alphabet.start();
		number.start();

	}

}
