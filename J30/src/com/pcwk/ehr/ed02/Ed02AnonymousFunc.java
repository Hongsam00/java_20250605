/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일 명: Ed02AnonymousFunc.java <br/>
 */
package com.pcwk.ehr.ed02;

public class Ed02AnonymousFunc {

	public static void main(String[] args) {
		//익명 함수
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명 함수");
				
			}
		};
		
		//호출
		runnable.run();
	}

}
