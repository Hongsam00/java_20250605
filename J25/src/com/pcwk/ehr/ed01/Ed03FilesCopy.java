/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명 :Ed03FilesCopy.java
 */
package com.pcwk.ehr.ed01;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Paths;

public class Ed03FilesCopy {

	public static void main(String[] args) throws IOException {
		
		Path source = Paths.get("example.txt");
		Path target = Paths.get("copy_example.txt");
		
		//파일 복사
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("파일 복사 완료!");
	}

}
