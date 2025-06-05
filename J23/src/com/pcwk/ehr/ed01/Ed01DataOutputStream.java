package com.pcwk.ehr.ed01;

import java.io.*;

public class Ed01DataOutputStream {

	public static void main(String[] args) {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));){
			dos.writeInt(100);
			dos.writeDouble(3.14);
			dos.writeUTF("Hello, 목요일");
			dos.writeBoolean(true);
			
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
