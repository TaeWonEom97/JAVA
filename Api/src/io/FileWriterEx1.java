package io;

import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("c:\\tem\\test2.txt",true)) {
			writer.write("FileWriter은 문자열을 바로");
			writer.write("FileWriter은 문자열을 바로 출력할수 있다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
