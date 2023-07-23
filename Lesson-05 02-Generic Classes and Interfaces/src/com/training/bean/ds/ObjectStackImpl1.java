package com.training.bean.ds;

public class ObjectStackImpl1 {
	
	private Object[] array;
	private int currentIndex=0;
	
	public ObjectStackImpl1(int n) {
		this.array=new Object[n];
	}
	
	public void push(Object n) {
		this.array[currentIndex]=n;
		currentIndex++;
	}
	
	public Object pop() {
		currentIndex--;
		return  this.array[currentIndex];
		
	}
	
	@Override
	public String toString() {
		String str="[";
		for(int i=0; i< currentIndex ;i++)
			str=str+this.array[i].toString()+",";
		str=str+"]";
		return str;
	}

}
