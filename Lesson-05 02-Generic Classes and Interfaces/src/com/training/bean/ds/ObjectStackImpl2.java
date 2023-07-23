package com.training.bean.ds;

public class ObjectStackImpl2<T> {

	private Object[] array;
	private int currentIndex=0;
	
	public ObjectStackImpl2(int n) {
		this.array=new Object[n];
	}
	
	public void push(T n) {
		this.array[currentIndex]=n;
		currentIndex++;
	}
	
	public T pop() {
		currentIndex--;
		return (T) this.array[currentIndex];
		
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
