package com.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main1 {

	public static void main(String[] args) {
		
		InputStream in=null;
		
		try {
			in=new FileInputStream("some.txt");
			while(true) {
				int i=in.read();
				if(i==-1)
					break;
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Missing...");
			
		} catch (IOException e) {
			
			System.out.println("Error While Reading");
		}
		finally {
			if(in !=null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}

}
