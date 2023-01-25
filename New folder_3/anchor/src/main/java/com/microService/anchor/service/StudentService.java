package com.microService.anchor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microService.anchor.entity.StudentEntity;

@Service
public interface StudentService {

	List<StudentEntity> getAllStudents();

}
