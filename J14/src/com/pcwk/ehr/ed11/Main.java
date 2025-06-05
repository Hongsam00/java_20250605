/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed11;
 
public class Main {

	public static void main(String[] args) {

		Animal cat = new Animal() {

			@Override
			void sound() {
				System.out.println("금요일 고양이 야옹");
			}
			
		};
		cat.sound();
	}

}
