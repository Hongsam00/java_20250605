/**
 * 파일명:Ed01PriorityOperator.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed05;


public class Ed01PriorityOperator {

	public static void main(String []args) {
		
		int result = 5 + 3 * 2;
		//5 + 3 * 2=11
		System.out.println("5 + 3 * 2="+result);
		
		//괄호로 우선순위 변경
		result = (5 + 3) * 2;
		//(5 + 3) * 2=16
		System.out.println("(5 + 3) * 2="+result);
		
		//증감 연산자의 전위와 후위
		int a = 5;
		//5
		System.out.println(a++);
		//7
		System.out.println(++a);
		
		//논리 연산자와 비교 연산자
		int x = 10;
		int y = 20;
		
		boolean resultValue = x<y && y>15;
		//true
		System.out.println(resultValue);//true
		
		//결합 방향: 오른 쪽에서 왼쪽.
		x = 10;
		x = y = 5;
		System.out.println("x:"+x);//5
		System.out.println("y:"+y);//5
		
	}
	
}
