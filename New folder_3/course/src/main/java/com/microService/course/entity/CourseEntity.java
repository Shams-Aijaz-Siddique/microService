package com.microService.course.entity;

import javax.persistence.*;

@Entity
@Table(name="course_ms")
public class CourseEntity {

	@Id
	@Column(name = "course_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseId;
	
	@Column(name="course_Name")
	private String courseName;
	
	@Column(name="student_Name")
	private String studentName;
	
	@Column(name="student_Email")
	private String studentEmail;
	
	
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	@Override
	public String toString() {
		return "CourseEntity [courseId=" + courseId + ", courseName=" + courseName + ", studentName=" + studentName
				+ ", studentEmail=" + studentEmail + "]";
	}
}
