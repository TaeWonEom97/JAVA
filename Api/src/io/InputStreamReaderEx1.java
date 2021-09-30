package io;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {

	public static void main(String[] args) {
		try(InputStreamReader reader = new InputStreamReader(new FileInputStream("c:\\tem\\file1.txt"),"ms949");
				FileWriter writer = new FileWriter("c:\\tem\\test3.txt")) {
			char cbuf[]= new char[100];
			while(reader.read(cbuf)!=-1) {
				writer.write(cbuf);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
