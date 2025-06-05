/**
 * Package Name : com.pcwk.ehr.ex08 <br/>
 * 파일 명: Funtion.java <br/>
 */
package com.pcwk.ehr.ex08;

@FunctionalInterface
public interface Function<T> {
	public double apply(T t);
}
