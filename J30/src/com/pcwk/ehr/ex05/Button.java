/**
 * Package Name : com.pcwk.ehr.ex05 <br/>
 * 파일 명: Button.java <br/>
 */
package com.pcwk.ehr.ex05;

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}
	
	private ClickListener clickListener;

	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
