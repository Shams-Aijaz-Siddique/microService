package com.microService.anchor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microService.anchor.entity.StudentEntity;
import com.microService.anchor.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<StudentEntity> getAllStudents() {
		return studentRepository.findAll();
//		return null;
	}

}
