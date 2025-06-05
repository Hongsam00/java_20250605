/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * Class Name: Ed01Files.java <br/>
 * Description:  <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-22<br/>
 *
 * ------------------------------------------<br/>
 * @author :user
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.ed01;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Ed01Files {

	public static void main(String[] args) {
		
		Path path = Paths.get("example.txt");
		
		List<String> lines = Arrays.asList("오늘은 비오는 화요일.", "내일은 즐거운 수요일.");
		
		try {
			Files.write(path, lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 작성 완료!");
	}

}
