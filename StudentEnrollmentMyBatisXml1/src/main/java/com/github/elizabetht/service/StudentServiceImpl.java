package com.github.elizabetht.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.elizabetht.dao.StudentDAO;
import com.github.elizabetht.vo.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Resource(name = "studentDao")
	private StudentDAO studentDao;

	@Transactional
	public void insertStudent(Student student) {
		studentDao.insertStudent(student);
	}

	public boolean getStudentByLogin(String userName, String password) {
		Student student = studentDao.getStudentByUserName(userName);

		if (student != null && student.getPassword().equals(password)) {
			return true;
		}

		return false;
	}

	public boolean getStudentByUserName(String userName) {
		Student student = studentDao.getStudentByUserName(userName);

		if (student != null) {
			return true;
		}

		return false;
	}

	public void getStudents(Student student) {

		List<Student> planList = studentDao.getStudents(student);

		student.setStudentList(planList);

	}

}
