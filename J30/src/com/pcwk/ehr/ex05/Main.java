/**
 * Package Name : com.pcwk.ehr.ex05 <br/>
 * 파일 명: Main.java <br/>
 */
package com.pcwk.ehr.ex05;

public class Main {

	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(() -> System.out.println("Ok 버튼을 클릭했습니다."));
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
		btnCancel.click();
	}

}
