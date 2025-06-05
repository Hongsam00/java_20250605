/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * 파일명 :Box.java
 */
package com.pcwk.ehr.ed06;

public class Box<T extends Comparable<T>> {

	private T data;

	/**
	 * @param data
	 */
	public Box(T data) {
		super();
		this.data = data;
	}

	public boolean isGreaterThen(T other) {
		int flag = data.compareTo(other);
		System.out.println("flag:" + flag);
		//양수 : data크다 other보다
		//음수 : data작다 other보다
		return data.compareTo(other) > 0;
	}
}
