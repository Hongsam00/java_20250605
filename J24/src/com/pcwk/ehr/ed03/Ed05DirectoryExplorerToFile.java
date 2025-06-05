package com.pcwk.ehr.ed03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ed05DirectoryExplorerToFile {
	// exploreAndWriter() void param1:File, param2: int, param3: writer
	public static void exploreAndWriter(File dir, int depth, BufferedWriter writer) throws IOException {

		// 인덴트
		String indent = "\t".repeat(depth);

		if (dir.isDirectory() == true) {
			writer.write(indent + " [DIR] " + dir.getName());
			writer.newLine(); //OS Line skip

			File[] files = dir.listFiles();

			if(null != files) {
				for(File f : files) {
					exploreAndWriter(f, depth+1, writer);
				}
			}
			
			// File
		} else {
			writer.write(indent + "- 파일: " + dir.getName());
			writer.newLine();
		}
	}

	public static void main(String[] args) {

		// 탐색할 Root 디렉토리
		File rootDir = new File("D:\\JAP_20250317\\01_JAVA\\workspace\\J24\\src");

		// 출력할 파일
		File outputFile = new File("directory_structure.txt");

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));) {

			if (rootDir.exists() == true) {
				exploreAndWriter(rootDir, 0, writer);
				System.out.println("탐색 결과가 저장 되었습니다: "+rootDir.getAbsolutePath());
			} else {
				System.out.println("지정된 경로가 존재하지 않습니다.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
