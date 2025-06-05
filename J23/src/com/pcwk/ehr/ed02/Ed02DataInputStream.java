package com.pcwk.ehr.ed02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ed02DataInputStream {

	public static void main(String[] args) {

		try (DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"));) {

			for (int i = 0; i < 2; i++) {
				String name = dis.readUTF();
				int score = dis.readInt();
				int rank = dis.readInt();
				System.out.printf("읽은 값:%s, %d, %d%n", name, score, rank);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
