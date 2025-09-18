package com.github.elizabetht.service;

import java.util.List;

import com.github.elizabetht.vo.Student;

public interface StudentService {
	void insertStudent(Student student);
	boolean getStudentByLogin(String userName, String password);
	boolean getStudentByUserName(String userName);
	void getStudents(Student student);
	public int getCntAllSectorCovered();
	public int getCntAllWDays();
	int getCntMaleAllWDays();
	int getCntFemaleAllWDays();
	int getCntHHEmployed();
	int getCntMaleHHEmployed();
	int getCntFemaleHHEmployed();
	List<Student> getRecipientsPerDistricts(Student student);
	Student getRecipientsPerProjectsTransport();
	Student getRecipientsPerProjectsTerrace();
	int getCntAllSectorCoveredByePw();
	int getCntAllWDaysEPw();
	int getCntMaleAllWDaysEPw();
	int getCntFemaleAllWDaysEPw();
	int getCntHHEmployedEPw();
	int getCntMaleHHEmployedEPW();
	int getCntFemaleHHEmployedEPw();
	List<Student> getRecipientsPerDistrictsEPW(Student student);
	List<Student> getRecipientsPerDistrictsEPwLB();
	List<Student> getRecipientsPerDistrictsEPwECD(Student student);
	List<Student> getRecipientsPerDistrictsDS(Student student);
	List<Student> getRecipientsPerDistrictsDsWithDisability(Student student);
	List<Student> getRcpntsPerDstrctsWithDisabilityUnderAge(Student student);
	List<Student> getRcpntsPerDstrctsOAG(Student student);
	List<Student> getRcpntsPerDstrctsSkills(Student student);
	List<Student> getRcpntsPerDstrctsAsset(Student student);
	List<Student> getRcpntsPerDstrctsLiveStock(Student student);
	List<Student> getRcpntsPerDstrctsStartup(Student student);
	List<Student> getRecipientsPerDistrictsShock(Student student);
	Student getRecipientsPerDistrictsPerfIndicator(Student student);
	Student getRecipientsPerDistrictsPerfIndicatorShock(Student student);
	Student getAllKeyIndicatorsDS(Student student);
	Student getAllKeyIndicatorsCPW(Student student);
	Student getAllKeyIndicatorsEPW(Student student);
	Student getRecipientsPWPerProjectType(Student student);
	
}
