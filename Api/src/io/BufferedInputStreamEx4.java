package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx4 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("c:\\tem\\picture.jpg")){
			
			byte data[]=new byte[1024];
			
			long start = System.currentTimeMillis();
			while(fis.read()!=-1) {
				
			}
			long end = System.currentTimeMillis();
			System.out.println("Fileinputstream 사용시 "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		
		try(FileInputStream fis = new FileInputStream("c:\\tem\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			
			byte data[]=new byte[1024];
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {
				
			}
			long end=System.currentTimeMillis();
			System.out.println("Fileinputstream+BufferInputStream 사용시 "+(end-start));
		
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
