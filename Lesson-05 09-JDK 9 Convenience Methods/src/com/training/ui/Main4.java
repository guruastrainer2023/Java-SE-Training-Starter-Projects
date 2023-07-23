package com.training.ui;

import java.util.Set;

import com.training.bean.Gender;
import com.training.bean.Student;

public class Main4 {

	public static void main(String[] args) {
		
		Student s1=new Student(1001, "Rahul", Gender.MALE, 66.12, "Mechanical Engineering");
		Student s2=new Student(1002, "Vinitha", Gender.FEMALE, 88.0, "Civil Engineering");
		
		Set<Student> studentSet=Set.of(
				s1, 
				s2,
				new Student(1003, "Robert", Gender.MALE, 91.0, "Computer Science"),
				new Student(1004, "Jency", Gender.FEMALE, 51.0, "")
				);
		
		for(Student student:studentSet) {
			System.out.println(student.getRollNo()+"-"+student.getName()+"-"+student.getAverageMark());
		}
	}

}
