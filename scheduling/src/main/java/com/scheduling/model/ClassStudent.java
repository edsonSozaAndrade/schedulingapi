package com.scheduling.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ClassStudent {
	@Id
	private Integer courseStudentId;
	
	@ManyToOne
    @JoinColumn(name = "student_Id")
    Student student;
 
    @ManyToOne
    @JoinColumn(name = "class_Code")
    SchoolClass schoolClass;
    
    //Getter

	public Integer getCourseStudentId() {
		return courseStudentId;
	}
	public Student getStudent() {
		return student;
	}
	public SchoolClass getClasses() {
		return schoolClass;
	}
	//Setter

	public void setCourseStudentId(Integer courseStudentId) {
		this.courseStudentId = courseStudentId;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setClasses(SchoolClass class1) {
		schoolClass = class1;
	}  
}
