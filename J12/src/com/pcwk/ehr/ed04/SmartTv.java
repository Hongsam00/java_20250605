/**
 * 파일명:SmartTv.java<br/>
 * 생성일:2025-04-02
 */
package com.pcwk.ehr.ed04;

public class SmartTv extends Tv {
	String app; //현재 실행 중인 앱
	
	//Default생성자
	public SmartTv() {

	}
	
	//앱 실행 메서드
	void runApp(String appName) {
		this.app = appName;
		System.out.println(appName + "앱을 실행합니다.");
	}
	
	//앱 종료 메서드
	void closeApp() {
		System.out.println(app + "앱을 종료합니다.");
		app = null;
	}
}
