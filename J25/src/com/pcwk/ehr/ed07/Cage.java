/**
 * Package Name : com.pcwk.ehr.ed07 <br/>
 * 파일명 :Cage.java
 */
package com.pcwk.ehr.ed07;

public class Cage<T> {
	
	public void addAnimal(T animal) {
		System.out.println("동물이 추가 되었습니다." + animal);
	}
}
