/**
 * 파일명:CustomerClass.java<br/>
 * 생성일:2025-04-01 
 */
package com.pcwk.ehr.ed05;

public class CustomerClass {
	String name; //이름
	int age; //나이
	
	static int serialNo; //번호
	
	//인스턴스 블럭
	{
		name = "이상무";
		age = 23;
		System.out.println("인스턴스 블럭");
	}
	
	//static 블럭
	static {
//		serialNo++;
		System.out.println("static 블럭");
	}
	
	//Default생성자
	public CustomerClass() {
		//생성자 체이닝
//		this("무명씨", 1); //생성자에서 또 다른 생성자 호출
		serialNo++;
	}
	
	public CustomerClass(String name, int age) {
		//this는 CystomerClass
		this.name = name;
		this.age = age;
	}
	
	//인스턴스 메서드
	public void displayInfo() {
		//나의 이름은: 이상무, 나이는: 23 입니다.
		System.out.printf("나의 이름은 : %s, 나이는: %d입니다.%n", this.name, this.age);
	}
	
	//인스턴스 메서드 오버로딩
	public void displayInfo(int newAge) {
		System.out.printf("나의 이름은 : %s, 새로운 나이는: %d입니다.%n", this.name, newAge);
	}
	
	//인스턴스 메서드 오버로딩: 가변인자
	public void displayInfo(String label, int ...numbers) {
		System.out.println("label: " + label);
		
		for(int num : numbers) {
			System.out.print(num + ",");
		}
		System.out.println();
	}
	
	//클래스 메서드 : 인스턴스 변수에 영향을 받지 않는 메서드
	public static void staticDisplayInfo() {
		System.out.println("serialNo: "+ serialNo);
	}

}
