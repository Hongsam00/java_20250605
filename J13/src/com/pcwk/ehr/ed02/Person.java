/**
 * 파일명:Person.java<br/>
 * 생성일:2025-04-03
 */
package com.pcwk.ehr.ed02;

import java.util.Objects;

public class Person {
	
	String name;

	/**
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Person [name = " + name + "]";
	}
	
}
