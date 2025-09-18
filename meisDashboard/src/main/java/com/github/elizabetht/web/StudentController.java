package com.github.elizabetht.web;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.github.elizabetht.service.StudentService;
import com.github.elizabetht.vo.Student;
import com.github.elizabetht.vo.StudentLogin;

//@Controller
@Controller("studentController")
//@SessionAttributes("student")
public class StudentController {

	// @Autowired
	@Resource(name = "studentService")
	private StudentService studentService;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(@ModelAttribute("student") Student student, Model model) {
		
		System.out.println("getFiscYr-->  "+student.getFiscYr());
		System.out.println("getDistrictNo--->"+student.getDistrictNo());
		
		//if (student.getDistrictNo() == null || student.getDistrictNo() == 0) {
		if (student.getDistrictNo() == null) {
			student.setDistrictNo(1);
			student.setFiscYr(18);
		}
		model.addAttribute("student", student); // make sure it’s in the model
		
		//CPW
		Student indicatorsCPW = studentService.getAllKeyIndicatorsCPW(student);
//		int cntAllSectors = studentService.getCntAllSectorCovered();
//		int cntAllWDays = studentService.getCntAllWDays();
//		int cntMaleAllWDays = studentService.getCntMaleAllWDays();
//		int cntFemaleAllWDays = studentService.getCntFemaleAllWDays();
//		int cntHHEmployed = studentService.getCntHHEmployed();
//		int cntMaleHHEmployed = studentService.getCntMaleHHEmployed();
//		int cntFemaleHHEmployed = studentService.getCntFemaleHHEmployed(); 
		
		
		List<Student> listOfDistricts = studentService.getRecipientsPerDistricts(student);	
		Student listOfPWProjType = studentService.getRecipientsPWPerProjectType(student);
//		Student listOfProjTrans = studentService.getRecipientsPerProjectsTransport();
//		Student terraceInfo = studentService.getRecipientsPerProjectsTerrace();
		
		//EPW
		Student indicatorsEPW = studentService.getAllKeyIndicatorsEPW(student);
		
//		int cntAllSectorsEPW = studentService.getCntAllSectorCoveredByePw();
//		int cntAllWDaysEPW = studentService.getCntAllWDaysEPw();
//		int cntMaleAllWDaysEPW = studentService.getCntMaleAllWDaysEPw();
//		int cntFemaleAllWDaysEPW = studentService.getCntFemaleAllWDaysEPw();
//		int cntHHEmployedEPW = studentService.getCntHHEmployedEPw();
//		int cntMaleHHEmployedEPW = studentService.getCntMaleHHEmployedEPW();
//		int cntFemaleHHEmployedEPW = studentService.getCntFemaleHHEmployedEPw();
		
		List<Student> listOfDistrictsEPW = studentService.getRecipientsPerDistrictsEPW(student);
//		List<Student> listOfDistrictsEPwLB = studentService.getRecipientsPerDistrictsEPwLB();
		List<Student> listOfDistrictsEPwECD = studentService.getRecipientsPerDistrictsEPwECD(student);
		
		
		 //DS
		Student indicatorsDS = studentService.getAllKeyIndicatorsDS(student);
		
		List<Student> listOfDistrictsDS=studentService.getRecipientsPerDistrictsDS(student);
		List<Student> listOfDistrictsDSWithDisability = studentService.getRecipientsPerDistrictsDsWithDisability(student);
		List<Student> listOfDistrictsDisabilityUnderAge = studentService.getRcpntsPerDstrctsWithDisabilityUnderAge(student);
		
		//AOG
		List<Student> listOfDistrictsAOG = studentService.getRcpntsPerDstrctsOAG(student);
		
		//SKILLS
		List<Student> listOfDistrictsSkills = studentService.getRcpntsPerDstrctsSkills(student);
		
		//ASSET
		List<Student> listOfDistrictsAsset = studentService.getRcpntsPerDstrctsAsset(student);
		
		//livestock
		
		List<Student> listOfDistrictsLivestock  = studentService.getRcpntsPerDstrctsLiveStock(student);
		
		//startup tools
		List<Student> listOfDistrictsStartup  = studentService.getRcpntsPerDstrctsStartup(student);
		
		//SHOCK RESPONSIVE
		List<Student> listOfDistrictsShock  = studentService.getRecipientsPerDistrictsShock(student);
		
		//SHOCK RESP -INDICATOR
		
		Student srIndicator = studentService.getRecipientsPerDistrictsPerfIndicator(student);
		
		//SHOCK RESP - TYPE OF SHOCK
		Student srIndicatorTypeofShock = studentService.getRecipientsPerDistrictsPerfIndicatorShock(student);
		
		
		/*rendering on pages*/
		//CPW
		
		model.addAttribute("indicatorsCPW",indicatorsCPW);
		
//		model.addAttribute("cntAllSectors",cntAllSectors);
//		model.addAttribute("cntAllWDays",cntAllWDays);
//		model.addAttribute("cntMaleAllWDays",cntMaleAllWDays);
//		model.addAttribute("cntFemaleAllWDays",cntFemaleAllWDays);
//		model.addAttribute("cntHHEmployed",cntHHEmployed);
//		model.addAttribute("cntMaleHHEmployed",cntMaleHHEmployed);
//		model.addAttribute("cntFemaleHHEmployed",cntFemaleHHEmployed);	
		
		model.addAttribute("listOfDistricts",listOfDistricts);
		model.addAttribute("totlistOfDistricts",listOfDistricts.size());
		model.addAttribute("listOfPWProjType",listOfPWProjType);
		
		//model.addAttribute("listOfProjTrans",listOfProjTrans);
		//model.addAttribute("terrace",terraceInfo);
		
		//EPW(extended public works)
		
		model.addAttribute("indicatorsEPW",indicatorsEPW);
		
//		model.addAttribute("cntAllSectorsEPW",cntAllSectorsEPW);
//		model.addAttribute("cntAllWDaysEPW",cntAllWDaysEPW);
//		model.addAttribute("cntMaleAllWDaysEPW",cntMaleAllWDaysEPW);
//		model.addAttribute("cntFemaleAllWDaysEPW",cntFemaleAllWDaysEPW);
//		model.addAttribute("cntHHEmployedEPW",cntHHEmployedEPW);
//		model.addAttribute("cntMaleHHEmployedEPW",cntMaleHHEmployedEPW);
//		model.addAttribute("cntFemaleHHEmployedEPW",cntFemaleHHEmployedEPW);
		
		model.addAttribute("listOfDistrictsEPW",listOfDistrictsEPW);
		model.addAttribute("totlistOfDistrictsEPW",listOfDistrictsEPW.size());
//		//model.addAttribute("listOfDistrictsEPwLB",listOfDistrictsEPwLB);
		model.addAttribute("listOfDistrictsEPwECD",listOfDistrictsEPwECD);
		model.addAttribute("totlistOfDistrictsEPwECD",listOfDistrictsEPwECD.size());
		
		//DS(direct support)
		
		model.addAttribute("indicatorsDS",indicatorsDS);
		model.addAttribute("listOfDistrictsDS",listOfDistrictsDS);
		model.addAttribute("totlistOfDistrictsDS",listOfDistrictsDS.size());
		model.addAttribute("listOfDistrictsDisability",listOfDistrictsDSWithDisability);
		model.addAttribute("totlistOfDistrictsDSWithDisability",listOfDistrictsDSWithDisability.size());
		
		model.addAttribute("listOfDistrictsDisabilityUnderAge", listOfDistrictsDisabilityUnderAge);
		model.addAttribute("totlistOfDistrictsDisabilityUnderAge",listOfDistrictsDisabilityUnderAge.size());
		
		//AOG
		model.addAttribute("listOfDistrictsAOG", listOfDistrictsAOG);
		model.addAttribute("totlistOfDistrictsAOG",listOfDistrictsAOG.size());
		
		//SKILLS 
		model.addAttribute("listOfDistrictsSkills", listOfDistrictsSkills);
		model.addAttribute("totlistOfDistrictsSkills",listOfDistrictsSkills.size());
		
		//ASSET
		model.addAttribute("listOfDistrictsAsset", listOfDistrictsAsset);
		model.addAttribute("totlistOfDistrictsAsset",listOfDistrictsAsset.size());
		
		//LIVESTOCK
		model.addAttribute("listOfDistrictsLivestock", listOfDistrictsLivestock);
		model.addAttribute("totlistOfDistrictsLivestock",listOfDistrictsLivestock.size());
		
		//STARTUP TOOLS
		model.addAttribute("listOfDistrictsStartup", listOfDistrictsStartup);
		model.addAttribute("totlistOfDistrictsStartup",listOfDistrictsStartup.size());
		
		//SHOCK
		model.addAttribute("listOfDistrictsShock", listOfDistrictsShock);
		model.addAttribute("totlistOfDistrictsShock", listOfDistrictsShock.size());
		
		//SHOCK INDICATOR
		model.addAttribute("srIndicator", srIndicator);
		
		//SHOCK RESP - TYPE OF SHOCK
		model.addAttribute("srIndicatorTypeofShock", srIndicatorTypeofShock);
				 
		
		
		return "signup";
	}
	
	@RequestMapping(value = "/program", method = RequestMethod.GET)
	public String program(@ModelAttribute("student") Student student, Model model) {
		System.out.println("Program Controller");
		
		Student indicatorsCPW = studentService.getAllKeyIndicatorsCPW(student);
		model.addAttribute("indicatorsCPW",indicatorsCPW);
		
		return "test";
	}
	
	

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup1(@ModelAttribute("student") Student student, Model model) {
		if (studentService.getStudentByUserName(student.getUserName())) {
			model.addAttribute("message",
					"User Name exists. Try another user name");
			return "signup";
		} else {
			studentService.insertStudent(student);
			model.addAttribute("message", "Saved student details");
			return "redirect:login.html";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		StudentLogin studentLogin = new StudentLogin();
		model.addAttribute("studentLogin", studentLogin);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(
			@ModelAttribute("studentLogin") StudentLogin studentLogin) {
		boolean found = studentService.getStudentByLogin(
				studentLogin.getUserName(), studentLogin.getPassword());
		if (found) {
			return "success";
		} else {
			return "failure";
		}
	}
	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public String getUsers(@ModelAttribute("student") Student student,
			ModelMap model) {
		
		studentService.getStudents(student);
		
		
		model.addObject("students", student.getStudentList());
		

		return "students";
	}
	
	
	/*@RequestMapping(value = "/login1", method = RequestMethod.GET)
	public String selectMyPageInfoSuplr(@ModelAttribute("Student") Student student
									   , ModelMap model
									   ) throws Exception {
  		
		System.out.println("Hello Sir");

	//	eCCSPContSuprtService.selectMyPageInfoSuplr(eCCSPMyPageVO);

		//model.addAttribute("NewContVO", eCCSPMyPageVO.getContsVO().getNewContVO());
	
	
		return "login";
	}*/

	
	
	

}
