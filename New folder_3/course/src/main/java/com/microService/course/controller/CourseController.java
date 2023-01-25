package com.microService.course.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.microService.course.entity.StudentEntity;
import com.microService.course.service.StudentService;


public class CourseController {

	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getAllStudent")
	public List<StudentEntity> getAllStudent(Model model) {
		List<StudentEntity>  studentList = new ArrayList<>();
		try {
			studentList = studentService.getAllStudents();
			model.addAttribute("students", studentList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}
}
