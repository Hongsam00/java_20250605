/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 파일 명: Ed10Return.java <br/>
 */
package com.pcwk.ehr.ed04;

import java.util.function.*;

public class Ed10Return {
	
	static Function<Integer, Integer> getMultiple(int factor){
		
		return x -> x * factor;
	}
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> doubler = getMultiple(5);
		
		System.out.println(doubler.apply(19));
	}

}
