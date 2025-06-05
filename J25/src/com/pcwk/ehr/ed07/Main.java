/**
 * Package Name : com.pcwk.ehr.ed07 <br/>
 * 파일명 :Main.java
 */
package com.pcwk.ehr.ed07;

public class Main {

	public static void main(String[] args) {
		//? super Dog : Dog클래스와 그 상위 클래스만 허용
		Cage<? super Dog> dogCage = new Cage<>();
		dogCage.addAnimal(new Dog());
		
		//Cat은 허용되지 않음 (Cat은 Dog의 상위 클래스가 아니므로)
		//dogCage.addAnimal(new Cat());
		
		dogCage.addAnimal(new Dog());
	}

}
