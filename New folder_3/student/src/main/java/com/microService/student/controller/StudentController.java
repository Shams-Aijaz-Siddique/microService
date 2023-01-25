package com.microService.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microService.student.entity.StudentEntity;
import com.microService.student.service.StudentService;


@Controller
@RequestMapping("studentWeb")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/")
	public String index() {
		return "add";
	}
	
//	@RequestMapping("/getAllStudents")
//	public String getAllStudents(Model model) {
//		List<StudentEntity>  studentList = new ArrayList<>();
//		try {
//			studentList = studentService.getAllStudents();
//			model.addAttribute("students", studentList);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "view";
//	}
	
	@RequestMapping("/getAllStudent")
	public List<StudentEntity> getAllStudent(Model model) {
		List<StudentEntity>  studentList = new ArrayList<>();
		studentList = studentService.getAllStudent();
		return studentList;
	}
	
	@RequestMapping("/saveData")
	public String saveData(@ModelAttribute StudentEntity student, Model model) {
		String msg = studentService.saveData(student);
		model.addAttribute("valid",msg);
		if(!msg.equals("success")) {
			List<StudentEntity> studentList = studentService.getAllStudents();
			model.addAttribute("students", studentList);
			return "view";
		}
		return "redirect:/studentWeb/";
	}
	
	@RequestMapping("/getStudentByStudentId/{studId}")
	public StudentEntity getStudentByStudentId(@PathVariable Integer studId) {
		
		return studentService.getStudentByStudentId(studId);
		
	}

}
