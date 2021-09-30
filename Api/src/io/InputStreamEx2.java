package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		try {
			int input = in.read();
			out.write(input);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
