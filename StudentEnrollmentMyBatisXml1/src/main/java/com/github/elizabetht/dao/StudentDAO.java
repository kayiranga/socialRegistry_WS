package com.github.elizabetht.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.github.elizabetht.vo.Student;
@Repository("studentDao")
public interface StudentDAO {
	
	
	
//	@Insert("INSERT INTO student(userName, password, firstName,"
//			+ "lastName, dateOfBirth, emailAddress) VALUES"
//			+ "(#{userName},#{password}, #{firstName}, #{lastName},"
//			+ "#{dateOfBirth}, #{emailAddress})")
//	@Options(useGeneratedKeys = true, keyProperty = "id", flushCache = true, keyColumn = "id")
	public void insertStudent(Student student);

	@Select("SELECT USERNAME as userName, PASSWORD as password, "
			+ "FIRSTNAME as firstName, LASTNAME as lastName, "
			+ "DATEOFBIRTH as dateOfBirth, EMAILADDRESS as emailAddress "
			+ "FROM student WHERE userName = #{userName}")
	public Student getStudentByUserName(String userName);
	
	List<Student> getStudents(Student student);

}
