package com.microService.anchor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microService.anchor.entity.StudentEntity;
import com.microService.anchor.service.StudentService;

@RestController
public class AnchorController {
	
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getAllStudent")
	public List<StudentEntity> getAllStudent(Model model) {
		List<StudentEntity>  studentList = new ArrayList<>();
		try {
			studentList = studentService.getAllStudents();
			model.addAttribute("students", studentList);
			System.out.println(studentList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}

}
