/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-03
 */
package com.pcwk.ehr.ed09;

public class Main {

	public static void main(String[] args) {
		PrivateClass p = new PrivateClass();
		//p.show();
		//System.out.println(p.num);

		p.setNum(20); //Setter통한 접근
		System.out.println(p.getNum()); //Getter통한 접근
	}

}
