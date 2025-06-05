/**
 * 파일명 : Ed04ArrayCopy.java<br/>
 * 생성일 : 2025-03-27<br/>
 */
package com.pcwk.ehr.ed01;

public class Ed04ArrayCopy {
	
	//메서드
	public static void disp(int []numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("numbers[%d] = %d%n", i, numbers[i]);
		}
	}
	public static void main(String[] args) {
		//배열 copy
		//1. 기존 배열보다 2배 큰 배열을 생성한다.
		//2. 기존 배열 데이터를 신규 배열에 copy한다.
		//3. 기존 배열 주소를 신규 배열 주소에 할당한다.
		
		int[]iArr = {77, 88, 99, 95, 76};
		disp(iArr);
		System.out.println("=======================");
		//1.
		int []iArrCp = new int[iArr.length * 2];
		disp(iArrCp);
		
		//2.
		for(int i = 0; i < iArr.length; i++) {
			iArrCp[i] = iArr[i];
		}
		System.out.println("== copy date ==");
		disp(iArrCp);
		
		//3.
		System.out.println("iArr : " + iArr);
		System.out.println("iArrCp : " + iArrCp);
		iArr = iArrCp;
		System.out.println("iArr : " + iArr);
		
		//결과확인
		System.out.println("== 결과확인 ==");
		disp(iArr);
	}
}
