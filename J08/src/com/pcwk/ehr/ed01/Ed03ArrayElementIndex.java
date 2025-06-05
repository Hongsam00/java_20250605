/**
 * 파일명:Ed03ArrayElementIndex.java <br/>
 * 생성일:2025-03-27 <br/>
 */
package com.pcwk.ehr.ed01;

public class Ed03ArrayElementIndex {

	//메서드
	public static void disp(int []numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.printf("numbers[%d]=%d%n",i,numbers[i]);
		}
	}
	
	public static void main(String[] args) {
		
		//배열 값 초기화1:
		int []numbers =new int[5];
		
		//전체데이터 출력
		for(int i=0;i<numbers.length;i++) {
			System.out.printf("numbers[%d]=%d%n",i,numbers[i]);
		}
		System.out.println("========================");
		
		//배열 값 초기화2:
		int []numbers02 =new int[] {11,22,33,44,55};//사용빈도 높지 않음!
		disp(numbers02);
		System.out.println("========================");
		
		//배열 값 초기화3:
		int []numbers03 = {14,16,19,50,54};
		disp(numbers03);
		
		//합계: numbers03
		int sum = 0;
		for(int i=0;i<numbers03.length;i++) {
			sum +=numbers03[i];
		}
		System.out.println("sum:"+sum);
		
		//평균: numbers03
		double avg=sum/(numbers03.length*1.0);
		System.out.println("평균:"+avg);
		
	}

}
