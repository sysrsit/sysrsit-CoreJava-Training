package com.sysrs.jobreadiness.corejava.iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) {
		try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"));
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.bin"))) {
			// Writing binary data
			dos.writeInt(42);
			dos.writeDouble(3.14);
			dos.writeUTF("Hello, Byte Streams!");
			
			// Reading binary data
			int intValue = dis.readInt();
			double doubleValue = dis.readDouble();
			
			String stringValue = dis.readUTF();
			System.out.println("Read values: " + intValue + ", " + doubleValue + ", " + stringValue);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
