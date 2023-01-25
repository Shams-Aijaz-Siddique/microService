package com.microService.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.microService.course.entity.StudentEntity;
import com.microService.course.repository.StudentRepository;

public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	
	
	@Override
	public List<StudentEntity> getAllStudents() {
		return studentRepository.findAll();
	}

}
