package com.pkg;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/control")
@Controller
public class StudentController {
	@Autowired
	StudentDAO studentDAO;

	@RequestMapping(value = "/allStuds", method = RequestMethod.GET)
	public String indexRoute(Model m) {
		System.out.println("\nStudents are : ");
		List<Student> students = studentDAO.getAllStudents();
		System.out.println(students);
		return "viewStuds";

	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createRoute(@ModelAttribute("student") Student student) {
		System.out.println(studentDAO.insertStudent(student));
		return "redirect:/control/allStuds";
	}

	@RequestMapping(value = "/dis")
	public String newRoute(Model m) {
		m.addAttribute("student", new Student());
		return "addStuds";
	}
}