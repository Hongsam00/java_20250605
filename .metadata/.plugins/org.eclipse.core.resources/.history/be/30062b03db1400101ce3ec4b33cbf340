package com.pcwk.ehr.ed01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ed02Throws {

	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("IOException:" + e.getMessage());
		}

	}

	public static void readFile() throws IOException {

		String fileName = "Ed02Throws.java";
		
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		reader.close();
	}

}
