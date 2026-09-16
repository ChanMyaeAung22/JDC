package com.jdc.online.demo;

import java.util.Arrays;

public class StudentRepository {
	
	private Student[] students = {};

	public int add(Student student) {
	 
		students = Arrays.copyOf(students, students.length + 1); // students.length = 1
		
		students[students.length - 1] = student.cloneWithNewId(students.length); // student = index[0]
		
		return students[students.length - 1].getId();
	}

	public Student findById(int id) {
		
		if(id > 0 && id<= students.length) {
			return students[id - 1];
		}
		
		return null;
	}

	public Student[] getAll() {
		// TODO Auto-generated method stub
		return Arrays.copyOf(students, students.length);
	}


}
