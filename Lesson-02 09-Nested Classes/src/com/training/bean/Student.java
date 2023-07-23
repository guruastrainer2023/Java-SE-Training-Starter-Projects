package com.training.bean;

import java.util.Objects;

public class Student {
	private int rollNumber;
	private String name;
	private int mark1,mark2,mark3;
	
	public Student(int rollNumber, String name, int mark1, int mark2, int mark3) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public Student() {
		super();
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", mark1=" + mark1 + ", mark2=" + mark2
				+ ", mark3=" + mark3 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNumber == other.rollNumber;
	}
	
	public class Calculator{
		public int findSum(int ...values) {
			int sum=0;
			for(int i:values) {
				sum+=i;
			}
			return sum;
		}
		
		public int findAverage(int ...values) {
			int sum=0;
			for(int i:values) {
				sum+=i;
			}
			return sum/values.length;
		}
	}

}
