/**
 * 파일명:Outer.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed10;

public class Outer {
	
	public void method() {
		class Local {
			void display() {
				System.out.println("지역 클래스");
			}
		}
		
		Local local = new Local();
		local.display();
		
	}
}
