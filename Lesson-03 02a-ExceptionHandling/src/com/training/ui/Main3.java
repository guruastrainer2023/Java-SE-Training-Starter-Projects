package com.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main3 {

	public static void main(String[] args) {
		
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
		} catch (IOException | NumberFormatException e) {
			System.out.println("File Missing...");

		}

	}

}
