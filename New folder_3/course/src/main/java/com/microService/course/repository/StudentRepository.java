package com.microService.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microService.course.entity.StudentEntity;


public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
