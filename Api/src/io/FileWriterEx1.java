package io;

import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("c:\\tem\\test2.txt",true)) {
			writer.write("FileWriter�� ���ڿ��� �ٷ�");
			writer.write("FileWriter�� ���ڿ��� �ٷ� ����Ҽ� �ִ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
