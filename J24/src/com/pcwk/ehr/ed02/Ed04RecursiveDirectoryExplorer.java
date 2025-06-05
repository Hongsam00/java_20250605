package com.pcwk.ehr.ed02;

import java.io.*;

public class Ed04RecursiveDirectoryExplorer {

	// 함수이름: exploreDirectory(), param1: File, int, return void

	/**
	 * 하위 디렉토리를 재귀호출에서 읽기
	 * 
	 * @param rootDir
	 * @param num
	 */
	public static void exploreDirectory(File dir, int depth) {
		
		//들여 쓰기용 공백
		String indent = "    ".repeat(depth);
		
		if (dir.isDirectory() == true) {
			System.out.println(indent + "[DIR] " + dir.getName());
			File[] files = dir.listFiles();

			if (files != null) {
				// 향상된 for문
				for (File f : files) {
					exploreDirectory(f, depth+1);
				}
			}

		} else {
			System.out.println(indent+"- 파일:" + dir.getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File rootDir = new File("D:\\JAP_20250317\\01_JAVA\\workspace\\J24");
		if (rootDir.exists() == true) {

			exploreDirectory(rootDir, 0);

		} else {
			System.out.println("지정한 경로가 존재하지 않습니다.");
		}
	}

}
