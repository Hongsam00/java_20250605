/**
 * 파일명:Animal.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Animal {
	final Logger LOG = LogManager.getLogger(getClass());
	
	public Animal() {
		super();
		LOG.debug("Animal() Default생성자");
	}
	
	public void sound() {
		LOG.debug("동물이 소리를 냅니다.");
	}
	
}
