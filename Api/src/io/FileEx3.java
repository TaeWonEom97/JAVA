package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {

	public static void main(String[] args) {
		File tem=new File("c:\\tem");
		File dir=new File("c:\\tem\\dir");
		File file1=new File("c:\\tem\\file1.txt");
		File file2=new File("c:\\tem\\file2.txt");
		File file3=new File(tem,"file3.txt");
		File file4=new File("c:\\tem\\dir\\file4.txt");
		
		if(!tem.exists()) {
			tem.mkdir();
		}
		if(!dir.exists()) {
			dir.mkdir();
		}
		try {
			if(!file1.exists()) {
				file1.createNewFile();
			}
			if(!file2.exists()) {
				file2.createNewFile();
			}
			if(!file3.exists()) {
				file3.createNewFile();
			}
			if(!file4.exists()) {
				file4.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\t날짜\t시간\t형태\t크기\t이름");
		System.out.println("---------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File contents[]=tem.listFiles();
		for(File f:contents) {
			System.out.println(sdf.format(new Date(f.lastModified())));
			if(f.isDirectory()) {
				System.out.print("\t\t\t<DIR>\t"+f.getName());	
			}else {
				System.out.print("\t\t\t\t"+f.length()+"\t"+f.getName());
			}
			System.out.println();
		}
		
	}

}
