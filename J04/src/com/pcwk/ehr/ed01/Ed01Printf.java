package com.pcwk.ehr.ed01;

public class Ed01Printf {

	public static void main(String[] args) {
		int num = 14; //정수(default : int)
		final double PI = 3.14_1592_6535_8979D; //실수(default : double)
		String name = "영희";
		//%n, \n : line skip
		System.out.printf("나이 : %d살, 원주율 : %.6f, 이름은 : %s%n", num, PI, name);
		
		char grade = 'A';
		System.out.printf("성적은 : %c\n", grade);
		
		int hexaValue = 10; //10진수 10을 -> 16진수로 출력
		System.out.printf("10진수 : %d -> 16진수 : %x -> 8진수 : %o%n", hexaValue, hexaValue, hexaValue);
		
		//정수 출력(패딩) : 5개 자리 확보, 빈자리는 0으로 채움 (오른쪽 정렬)
		System.out.printf("패딩 :%05d%n", 23);
		
		//문자열 왼쪽정렬(-자리수)
		String fruit = "apple";
		float price = 200.5f;
		
		System.out.printf("좌측정렬 :%-10s, 가격 :%6.2f", fruit, price);
		
		byte doubleValue = 10;
		int result = 5 +doubleValue;
		System.out.println(result);
		 
	}

}
