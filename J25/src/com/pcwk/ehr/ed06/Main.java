/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * 파일명 :Main.java
 */
package com.pcwk.ehr.ed06;

public class Main {

	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>(88);
		
		System.out.println(intBox.isGreaterThen(10));

		System.out.println("-----------------------");
		Box<String> strBox = new Box<>("apple");
		System.out.println(strBox.isGreaterThen("banana"));
		
//		Bound mismatch: The type Object is not a valid 
//		substitute for the bounded parameter 
//		<T extends Comparable<T>> of the type Box<T>
//		Box<Object> objBox = new Box<>(ndw Object());
	}

}
