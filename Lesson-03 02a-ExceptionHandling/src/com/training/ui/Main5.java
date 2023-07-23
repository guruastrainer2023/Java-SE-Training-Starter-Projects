package com.training.ui;

import com.training.exceptions.NotFoundException;

public class Main5 {

	int[] ids=new int[] { 101, 102, 103, 104, 105};
	
	private void searchPrint(int searchid) {
		for(int i=0; i< ids.length; i++) {
			if(ids[i]==searchid) {
				System.out.println("Search Id "+ searchid + "Found !");
				return;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Main5 m=new Main5();
		m.searchPrint(109);
	}

}
