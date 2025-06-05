/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * 파일명: Counter.java <br/> 
 */
package com.pcwk.ehr.ed06;

public class Counter {

	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}

}
