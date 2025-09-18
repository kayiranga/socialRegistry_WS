package com.github.elizabetht.service;

import java.util.List;

import com.github.elizabetht.vo.Student;

public interface StudentService {
	void insertStudent(Student student);
	boolean getStudentByLogin(String userName, String password);
	boolean getStudentByUserName(String userName);
	void getStudents(Student student);
	
}
