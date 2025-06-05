/**
 * 파일명:Ed02PrintStream.java <br/>
 * 생성일:2025-04-17 
 */
package com.pcwk.ehr.ed03;

public class Ed02PrintStream {

	public static void main(String[] args) {
		//System.out은 PrintStream
		System.out.println("콘솔 출력");
		System.out.print("줄바꿈 없음");
		System.out.printf("나이:%d%n", 22);
		
		System.out.println("-------------------");
		System.err.println("System.err"); //Consol에 Red색으로 출력
	}

}
