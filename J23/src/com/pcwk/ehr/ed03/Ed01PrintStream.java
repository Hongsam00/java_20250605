/**
 * 파일명:Ed01PrintStream.java <br/>
 * 생성일:2025-04-17 
 */
package com.pcwk.ehr.ed03;

import java.io.*;

public class Ed01PrintStream {
	
	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("printStream.txt");
				PrintStream ps = new PrintStream(fos);) {
			 
				ps.print("오늘은 즐거운 금요일");
				ps.println("프린터가 출력하는 것처럼 ");
				ps.println("데이터를 출력 합니다.");
				ps.printf("|%7d |%-12s|%10s%n", 1,"홍길동","의적");
				ps.printf("|%7d |%-12s|%10s%n", 2,"이상무","학생");
				
			
				ps.flush();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("┌───────────────────────┐");
		System.out.println("│ Complete              │");
		System.out.println("└───────────────────────┘");
	}

}
