package io;

import java.io.IOException;
import java.io.InputStream;

public class inputStreamEx1 {

	public static void main(String[] args) {
		InputStream in = System.in;
		int input=0;
		try {
			while((input=in.read())!=-1) {
				System.out.print((char)input);		
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
