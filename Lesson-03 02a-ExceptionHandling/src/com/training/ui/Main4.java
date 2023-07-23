package com.training.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main4 {

	public static void main(String[] args) throws IOException {
		try (InputStream in = new FileInputStream("some.txt")) {

			String str="245";
			int num=Integer.parseInt(str);
			System.out.println(num);
			while (true) {
				
				
				int i = in.read();
				if (i == -1)
					break;
				System.out.print((char) i);
			}
		} 
	}

}
