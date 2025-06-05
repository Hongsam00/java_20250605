/**
 * Package Name : com.pcwk.ehr.ex06 <br/>
 * 파일 명: Main.java <br/>
 */
package com.pcwk.ehr.ex06;

import java.util.function.Function;

public class Main {
	@FunctionalInterface
	public interface Function {
	    double apply(double x, double y);
	}
	
	public static double calc(Function fun) {
		double x = 10;
		double y = 4;
		
		return fun.apply(x,y);
	}
	
	public static void main(String[] args) {
		
		double result = calc((x,y) -> (x/y));
		System.out.println("result: " + result);
	}

}
