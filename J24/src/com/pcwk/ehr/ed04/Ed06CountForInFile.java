package com.pcwk.ehr.ed04;

import java.io.*;

public class Ed06CountForInFile {
	// countForInFile() return int, param1: File file
	public static int countForInFile(File file) {
		int count = 0;
		
		//파일 읽기(한줄씩 읽기)
		try(BufferedReader reader = new BufferedReader(new FileReader(file));) {
			String line;
			
			while((line = reader.readLine()) != null) {
				//for라는 단어가 들어가 있는 문장 찾기
				if(line.trim().matches("^for\\s*\\(.*")) {
					count++;
					System.out.println(line);
				}

			}
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException:"+ file.getAbsolutePath());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException:"+file.getAbsolutePath());
			e.printStackTrace();
		}
		
		
		return count;
	}

	// 재귀적으로 디렉터리를 탐색하며 for문 수를 합산
	public static int countForStatements(File dir) {
		int count = 0;

		File[] files = dir.listFiles();
		if (null == files)
			return 0;

		for (File file : files) {
			if (file.isDirectory() == true) {

				// file: *.java
				// Ed06CountForInFile.java
				// 파일명에 "." 포함 될수 있음. 뒤에서 부터 파일을 읽어야 한다.

				count += countForStatements(file);

				// 파일: *.Java
			} else if (file.getName().lastIndexOf(".java") > -1) {
				count += countForInFile(file);
			}
		}

		return count;
	}

	public static void main(String[] args) {

		// 분석할 경로
		String dirPath = "D:\\JAP_20250317\\01_JAVA\\workspace\\J24";

		File rootDir = new File(dirPath);

		if (!rootDir.exists()) {
			System.out.println("경로가 존재하지 않습니다.");
			return;
		}
		int totalCount = countForStatements(rootDir);
		
		System.out.println("전체 for문 수: " + totalCount);
	}

}
