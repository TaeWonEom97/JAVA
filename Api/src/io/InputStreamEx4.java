package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte[] datas=new byte[100];
		
		System.out.print("�̸� : ");
		try {
			int nameBytes = in.read(datas);
			String name = new String(datas,0,nameBytes-2);
			System.out.print("�ϰ� ���� �� : ");
			int commentsBytes = in.read(datas);
			String comment = new String(datas,0,commentsBytes-2);
			
			System.out.println("�Է��� �̸� : "+name);
			System.out.println("�Է��� �ϰ� ���� �� : "+comment);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
