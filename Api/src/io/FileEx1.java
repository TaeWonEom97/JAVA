package io;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		File file1 = new File("c:\\tem\\test1.txt");
		File file2 = new File("c:\\tem\\test1.txt");
		
		File file3 = new File("c:\\tem","test1.txt");
		File file4 = new File(file3,"test1.txt");
	}

}
