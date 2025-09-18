package com.github.elizabetht.dao;

import java.util.List;


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

	
	public int getCntAllSectorCovered();

	public int getCntAllWDays();

	public int getCntMaleAllWDays();

	public int getCntFemaleAllWDays();

	public int getCntHHEmployed();

	public int getCntMaleHHEmployed();

	public int getCntFemaleHHEmployed();

	public List<Student> getRecipientsPerDistricts(Student student);

	public Student getRecipientsPerProjectsTransport();

	public Student getRecipientsPerProjectsTerrace();

	public int getCntAllSectorCoveredByePw();

	public int getCntAllWDaysEPw();

	public int getCntMaleAllWDaysEPw();

	public int getCntFemaleAllWDaysEPw();

	public int getCntHHEmployedEPw();

	public int getCntMaleHHEmployedEPw();

	public int getCntFemaleHHEmployedEPw();

	public List<Student> getRecipientsPerDistrictsEPW(Student student);

	public List<Student> getRecipientsPerDistrictsEPwLB();

	public List<Student> getRecipientsPerDistrictsEPwECD(Student student);

	public List<Student> getRecipientsPerDistrictsDS(Student student);

	public List<Student> getRecipientsPerDistrictsDsWithDisability(Student student);

	public List<Student> getRcpntsPerDstrctsWithDisabilityUnderAge(Student student);

	public List<Student> getRcpntsPerDstrctsOAG(Student student);

	public List<Student> getRcpntsPerDstrctsSkills(Student student);

	public List<Student> getRcpntsPerDstrctsAsset(Student student);

	public List<Student> getRcpntsPerDstrctsLiveStock(Student student);

	public List<Student> getRcpntsPerDstrctsStartup(Student student);

	public List<Student> getRecipientsPerDistrictsShock(Student student);

	public Student getRecipientsPerDistrictsPerfIndicator(Student student);

	public Student getRecipientsPerDistrictsPerfIndicatorShock(Student student);

	public Student getAllKeyIndicatorsDS(Student student);

	public Student getAllKeyIndicatorsCPW(Student student);

	public Student getAllKeyIndicatorsEPW(Student student);

	public Student getRecipientsPWPerProjectType(Student student);

}
