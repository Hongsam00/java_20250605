/**
 * 파일명:Ed04ArrayCopy.java <br/>
 * 생성일:2025-03-27 <br/>
 */
package com.pcwk.ehr.ed01;


public class Ed05ArraySystemArrayCopy {

	//메서드
	public static void disp(int []numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.printf("numbers[%d]=%d%n",i,numbers[i]);
		}
	}
	
	public static void main(String[] args) {
	
		
		//배열 copy 배열의 크기를 2배로 늘리기.
		
		//1. 기존배열보다 2배큰 배열을 생성한다.
		//2. System.arraycopy
		//3. 기존배열 주소를 신규배열 주소에 할당한다.
		
		int []iArr = {77,88,99,95,76};		
		disp(iArr);
		System.out.println("====================");
		//1.
		int []iArrCp = new int[iArr.length * 2];
		disp(iArrCp);
		
		//2.
		System.arraycopy(iArr, 0, iArrCp, 0, iArr.length);
		System.out.println("==System.arraycopy==");
		disp(iArrCp);
		
		//3.
		iArr = iArrCp;
		System.out.println("==기존배열 주소를 신규배열 주소에 할당==");
		disp(iArr);
	}

}
