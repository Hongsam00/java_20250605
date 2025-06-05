/**
 * 파일명:Cat.java<br/>
 * 생성일:2025-04-04

 */
package com.pcwk.ehr.ed02;

public class Cat extends Animal {

	public Cat() {
		//super();
		LOG.debug("Cat 생성자");
	}

	@Override
	public void sound() {
		//super.sound();
		LOG.debug("고양이가 야옹 웁니다.");
	}

}
