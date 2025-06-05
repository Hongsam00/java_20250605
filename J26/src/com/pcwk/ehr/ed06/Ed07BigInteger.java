/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * 파일명 : Ed07BigInteger.java <br/>
 */
package com.pcwk.ehr.ed06;

import java.math.*;

public class Ed07BigInteger {

	public static void main(String[] args) {
		//Long의 최대값
		System.out.println("Long.MAX_VALUE" + Long.MAX_VALUE);
		System.out.println("9223372036854775807".length());
		
		long maxLong = 9223372036854775807L;
		System.out.println("maxLong+1:" + (maxLong+1));
		
		BigInteger bigNum01 = new BigInteger("9223372036854775807");
		BigInteger bigNum02 = new BigInteger("1000000000000000000");
		
		BigInteger resultAdd = bigNum01.add(bigNum02);
		BigInteger resultSubtract = bigNum01.subtract(bigNum02);
		BigInteger resultMultiply = bigNum01.multiply(bigNum02);
		BigInteger resultDivide = bigNum01.divide(bigNum02);
		
		System.out.println("add:" + resultAdd);
		System.out.println("10223372036854775807".length());
		
		System.out.println("subtract: "+ resultSubtract);
		System.out.println("Multiply: " +resultMultiply);
		System.out.println("Divide :" + resultDivide);
	}

}
