/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명: Ed05MessageFormatSQL.java <br/> 
 */
package com.pcwk.ehr.ed01;

import java.text.MessageFormat;

public class Ed05MessageFormatSQL {

	public static void main(String[] args) {
		// INSERT into member (member_id, member_name) VALUES ('james01','이상무');
		// INSERT int {0} (member_id, member_name) VALUES (''{1}'',''{2}'');

		String tableName = "member";
		String memberId = "james01";
		String membername = "이상무";

		// SQL 포맷 작성
		String sqlFormat = "INSERT int {0}  (member_id, member_name) VALUES (''{1}'',''{2}'');";
		String formattedQuery = MessageFormat.format(sqlFormat, tableName, memberId, membername);

		System.out.println("SQL:\n" + formattedQuery);
	}

}
