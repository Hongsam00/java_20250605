/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 파일명 : Ed03LowerBoundWildCard.java <br/>
 */
package com.pcwk.ehr.ed03;

import java.util.*;

public class Ed03LowerBoundWildCard {

	//LoswerBounded Willdcard (? super T)
	//하한 제한 와일드 카드 특정 타입의 상위 클래스나 그 타입 자체를 허용합니다. 
	//즉, 하위 타입이 아닌 상위 타입을 제한합니다.
	
	public static void addElements(List<? super Integer> list) {
//		list.add(1);
//		list.add(2);
	}
	
	public static void main(String[] args) {
		
		List<Number> numberList = List.of(10, 20, 30);
		List<Object> objectList = List.of(new Object(), new Object());
		
		//Integer나 그 상위 클래스
		addElements(numberList);

		//리스트에서 값을 읽을 때는 상위 타입으로만 읽어야 함
		System.out.println(numberList);
		System.out.println(objectList);
	}

}
