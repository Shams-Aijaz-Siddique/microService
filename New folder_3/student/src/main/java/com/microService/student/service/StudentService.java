package com.microService.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microService.student.entity.StudentEntity;

@Service
public interface StudentService {

	List<StudentEntity> getAllStudents();
	List<StudentEntity> getAllStudent();

	StudentEntity getStudentByStudentId(Integer studId);

	String saveData(StudentEntity student);

}
