/**
 * Package Name : com.pcwk.ehr.ex07 <br/>
 * 파일명 :Ex07.java
 */
package com.pcwk.ehr.ex07;

import java.io.*;

public class Ex07 {

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\JAP_20250317\\01_JAVA\\workspace\\J25\\src\\com\\pcwk\\ehr\\ex07\\Ex07.java";

		try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {
			int rowNumber = 0;
			String rowData = "";

			while ((rowData = br.readLine()) != null) {
				System.out.printf("%2d: %s%n", ++rowNumber, rowData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
