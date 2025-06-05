/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명 :Ed02Files.java
 */
package com.pcwk.ehr.ed01;

import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.*;

public class Ed02Files {
	
	public static void main(String[] args) {

		Path path = Paths.get("example.txt");
		
		try {
			List<String> lines = Files.readAllLines(path);
			
			for(String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
