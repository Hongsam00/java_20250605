/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 클래스명 : Day.java <br/> 
 */
package com.pcwk.ehr.ed02;

public enum Day {
	MONDAY("월요일"),
	TUESDAY("화요일"),
	WEDNESDAY("수요일"),
	THURSDAY("목요일"),
	FRIDAY("금요일"),
	SATURDAY("토요일"),
	SUNDAY("일요일");
	
	//열거형 멤버 변수
	private final String koreanName;
	
	Day(String koreanName) {
		this.koreanName = koreanName;
	}

	/**
	 * @return the koreanName
	 */
	public String getKoreanName() {
		return koreanName;
	}
	
	
}
