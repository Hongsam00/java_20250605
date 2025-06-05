/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 클래스명 : Color.java <br/> 
 */
package com.pcwk.ehr.ed03;

public enum Color {
	RED("#FF0000"),BLUE("#0000FF"),GREEN("#00FF00");
	
	String hexCode;
	
	private Color(String hexCode){
		this.hexCode = hexCode;
	}

	public String getHexCode() {
		return hexCode;
	}
	
	
}
