/**
 * Package Name : com.pcwk.ehr.ex10 <br/>
 * 파일명 :Ex10.java
 */
package com.pcwk.ehr.ex10;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 원본파일 경로 :
		// 복사파일 경로 :

		// 1. 원본 파일이 존재하지 않을 경우. "원본 파일이 존재하지 않습니다"를 출력할 것.
		// 2. 복사 파일 경로에서 디렉토리가 존재하지 않으면 경로상의 모든 디렉토리를 자동 생성할 것.
		// 3. 복사가 성공되었을 때 "복사가 성공되었습니다."를 출력할 것.
		Scanner s = new Scanner(System.in);
		System.out.println("원본파일 경로 (D:\\JAP_20250317\\01_JAVA\\workspace\\J25\\tmp\\photo1.jpg)");
		String originalPath = s.nextLine();

		System.out.println("복사파일 경로 (D:\\JAP_20250317\\01_JAVA\\workspace\\J25\\tmp\\photo2.jpg)");
		String copyPath = s.nextLine();

		System.out.println("원본 파일 경로: " + originalPath);
		System.out.println("복사 파일 경로: " + copyPath);

		// 디렉토리명 구하기
		File orgFile = new File(originalPath);
		System.out.println("원본 디렉토리:" + orgFile.getParent());
		//1.
		if(orgFile.isFile() == false) {
			System.out.println("원본 파일이 존재하지 않습니다.");
		}
		
		// 2. 디렉토리가 존재 하지 않으면 생성
		File orgDir = new File(orgFile.getParent());
		
		if (orgDir.isDirectory() == false) {
			String dirMessage = orgDir.mkdirs() ? "디렉토리 생성" : " ";
			System.out.println("dirMessage: " + dirMessage);
		}
		
		//2.1 복사 디렉토리 생성
		File copyFile = new File(copyPath);
		File copyDir = new File(copyFile.getParent());
		
		if(copyDir.isDirectory() == false) {
			String dirMessage = copyDir.mkdirs() ? "저장 디렉토리 생성" : " ";
			System.out.println("dirMessage: " + dirMessage);

		}
		//3. 복사가 성공하면 "복사가 성공되었습니다" 출력
		Path orgPath = Paths.get(orgFile.getAbsolutePath());
		Path savePath = Paths.get(copyPath);
		
		try {
			Files.copy(orgPath, savePath, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			System.out.println("복사가 성공되었습니다.");
		
		
	}

}
