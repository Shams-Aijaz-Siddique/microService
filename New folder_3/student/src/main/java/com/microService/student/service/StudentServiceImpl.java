package com.microService.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microService.student.entity.StudentEntity;
import com.microService.student.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	@Value("${spring.application.url.getAllStudent}")
	String getAllStudents;
	
	RestTemplate restTemplate = new RestTemplate();
	public static String msg = "";
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public List<StudentEntity> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public StudentEntity getStudentByStudentId(Integer studId) {
		return studentRepository.findById(studId).get();
	}

	@Override
	public String saveData(StudentEntity student) {
		studentRepository.save(student);
		return "success";
	}

	@Override
	public List<StudentEntity> getAllStudent() {
		// TODO Auto-generated method stub
		ResponseEntity<StudentEntity[]> studentList = restTemplate.getForEntity(getAllStudents, StudentEntity[].class);
		StudentEntity students[] = studentList.getBody();
		List<StudentEntity> studentss = new ArrayList<>();
		for (StudentEntity student : students) {
			studentss.add(student);
		}
		return studentss;
	}

}
