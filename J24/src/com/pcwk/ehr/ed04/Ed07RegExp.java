package com.pcwk.ehr.ed04;

public class Ed07RegExp {

	//정규식
	public static void main(String[] args) {
		String[] lines = { "for(int i=0;i<10;i++) {", "    System.out.println(i);", "}",

				"for ( int j = 0 ; j < 5 ; j++ ) {", "    System.out.println(j);", "}" };
		for (String line : lines) {
			// for( 또는 for (
			//^: 단어의 시작
			//\\s: 공백
			//*: 0개 이상
			//\\(: ( 괄호
			//.: 문자 한개
			if (line.trim().matches("^for\\s*\\(.*")) {

				System.out.println(line.trim());
			}

		}
	}

}
