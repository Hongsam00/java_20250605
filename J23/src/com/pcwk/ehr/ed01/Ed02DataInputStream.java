package com.pcwk.ehr.ed01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ed02DataInputStream {

	public static void main(String[] args) {

		try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"));) {
			int number = dis.readInt();
			double pi = dis.readDouble();
			String message = dis.readUTF();
			boolean flag = dis.readBoolean();

			System.out.printf("읽은 값:%d, %.2f, %s, %b %n", number, pi, message, flag);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("┌───────────────────────┐");
		System.out.println("│ Complete              │");
		System.out.println("└───────────────────────┘");
	}

}
