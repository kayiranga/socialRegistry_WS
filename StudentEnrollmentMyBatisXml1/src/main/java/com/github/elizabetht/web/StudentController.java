package com.github.elizabetht.web;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	public String signup(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "signup";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@ModelAttribute("student") Student student, Model model) {
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

}
