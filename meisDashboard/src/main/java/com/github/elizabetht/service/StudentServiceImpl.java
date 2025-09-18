package com.github.elizabetht.service;

import java.util.List;

import javax.annotation.Resource;


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

	public int getCntAllSectorCovered() {
		int cntAllSectors = studentDao.getCntAllSectorCovered();
		return cntAllSectors;
	}

	public int getCntAllWDays() {
		// TODO Auto-generated method stub
		return studentDao.getCntAllWDays();
	}

	public int getCntMaleAllWDays() {
		// TODO Auto-generated method stub
		return studentDao.getCntMaleAllWDays();
	}

	public int getCntFemaleAllWDays() {
		// TODO Auto-generated method stub
		return studentDao.getCntFemaleAllWDays();
	}

	public int getCntHHEmployed() {
		// TODO Auto-generated method stub
		return studentDao.getCntHHEmployed();
	}

	public int getCntMaleHHEmployed() {
		// TODO Auto-generated method stub
		return studentDao.getCntMaleHHEmployed();
	}

	public int getCntFemaleHHEmployed() {
		// TODO Auto-generated method stub
		return studentDao.getCntFemaleHHEmployed();
	}

	public List<Student> getRecipientsPerDistricts(Student student) {
		// TODO Auto-generated method stub
		List<Student> districts = studentDao.getRecipientsPerDistricts(student);

		return districts;
	}

	public Student getRecipientsPerProjectsTransport() {
		Student projects = studentDao.getRecipientsPerProjectsTransport();
		return projects;
	}

	public Student getRecipientsPerProjectsTerrace() {
		Student terrace = studentDao.getRecipientsPerProjectsTerrace();
		return terrace;
	}

	public int getCntAllSectorCoveredByePw() {
		  int cntAllSectorCoveredByePw = studentDao.getCntAllSectorCoveredByePw();
		return cntAllSectorCoveredByePw;
	}

	public int getCntAllWDaysEPw() {
		// TODO Auto-generated method stub
		return studentDao.getCntAllWDaysEPw();
	}

	public int getCntMaleAllWDaysEPw() {
		// TODO Auto-generated method stub
		return studentDao.getCntMaleAllWDaysEPw();
	}

	public int getCntFemaleAllWDaysEPw() {
		// TODO Auto-generated method stub
		return studentDao.getCntFemaleAllWDaysEPw();
	}

	public int getCntHHEmployedEPw() {
		// TODO Auto-generated method stub
		return studentDao.getCntHHEmployedEPw();
	}

	public int getCntMaleHHEmployedEPW() {
		// TODO Auto-generated method stub
		return studentDao.getCntMaleHHEmployedEPw();
	}

	public int getCntFemaleHHEmployedEPw() {
		// TODO Auto-generated method stub
		return studentDao.getCntFemaleHHEmployedEPw();
	}

	public List<Student> getRecipientsPerDistrictsEPW(Student student) {
		// TODO Auto-generated method stub
		List<Student> districts = studentDao.getRecipientsPerDistrictsEPW(student);
		return districts;
	}

	public List<Student> getRecipientsPerDistrictsEPwLB() {
		// TODO Auto-generated method stub
		List<Student> districts = studentDao.getRecipientsPerDistrictsEPwLB();
		return districts;
	}

	public List<Student> getRecipientsPerDistrictsEPwECD(Student student) {
		// TODO Auto-generated method stub
		List<Student> districts = studentDao.getRecipientsPerDistrictsEPwECD(student);
		return districts;
	}

	public List<Student> getRecipientsPerDistrictsDS(Student student) {
		// TODO Auto-generated method stub
		List<Student> districts = studentDao.getRecipientsPerDistrictsDS(student);
		return districts;
	}

	public List<Student> getRecipientsPerDistrictsDsWithDisability(Student student) {
		// TODO Auto-generated method stub
		
		return studentDao.getRecipientsPerDistrictsDsWithDisability(student);
	}

	public List<Student> getRcpntsPerDstrctsWithDisabilityUnderAge(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getRcpntsPerDstrctsWithDisabilityUnderAge(student);
	}

	public List<Student> getRcpntsPerDstrctsOAG(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getRcpntsPerDstrctsOAG(student);
	}

	public List<Student> getRcpntsPerDstrctsSkills(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getRcpntsPerDstrctsSkills(student);
	}

	public List<Student> getRcpntsPerDstrctsAsset(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getRcpntsPerDstrctsAsset(student);
	}

	public List<Student> getRcpntsPerDstrctsLiveStock(Student student) {
		// TODO Auto-generated method stub
		return  studentDao.getRcpntsPerDstrctsLiveStock(student);
	}

	public List<Student> getRcpntsPerDstrctsStartup(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getRcpntsPerDstrctsStartup(student);
	}

	public List<Student> getRecipientsPerDistrictsShock(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getRecipientsPerDistrictsShock(student);
	}

	public Student getRecipientsPerDistrictsPerfIndicator(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getRecipientsPerDistrictsPerfIndicator(student);
	}

	public Student getRecipientsPerDistrictsPerfIndicatorShock(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getRecipientsPerDistrictsPerfIndicatorShock(student);
	}

	public Student getAllKeyIndicatorsDS(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getAllKeyIndicatorsDS(student);
	}

	public Student getAllKeyIndicatorsCPW(Student student) {
		// TODO Auto-generated method stub
		//System.out.println("getFiscYr88888"+student.getFiscYr());
		return studentDao.getAllKeyIndicatorsCPW(student);
	}

	public Student getAllKeyIndicatorsEPW(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getAllKeyIndicatorsEPW(student);
	}

	public Student getRecipientsPWPerProjectType(Student student) {
		// TODO Auto-generated method stub
		return studentDao.getRecipientsPWPerProjectType(student);
	}
	


}
