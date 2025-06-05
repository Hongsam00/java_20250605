/**
 * 파일명:Dog.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog extends Animal {

	final Logger LOG = LogManager.getLogger(getClass());
	
	public Dog() {
		//super();
		LOG.debug("Dog 생성자");
	}

	@Override
	public void sound() {
		//super.sound();
		LOG.debug("강아지가 멍멍 짖습니다.");
	}

}
