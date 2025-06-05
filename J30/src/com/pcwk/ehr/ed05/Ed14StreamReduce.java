/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * 파일 명: Ed13Stream.java <br/>
 */
package com.pcwk.ehr.ed05;

import java.util.*;
import java.util.stream.*;

public class Ed14StreamReduce {

	public static void main(String[] args) {

		int sum = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
		.reduce(0, (a, b) -> a + b);
		
		System.out.println("sum: " + sum);

	}

}
