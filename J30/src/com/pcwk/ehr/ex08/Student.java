/**
 * Package Name : com.pcwk.ehr.ex08 <br/>
 * 파일 명: Student.java <br/>
 */
package com.pcwk.ehr.ex08;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;

	public Student(String name, int englishScore, int mathScore) {
		super();
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}
	
}
