package com.scheduling.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer studentId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	//Getter
	
	public int getStudentId() {
		return studentId;
	}	
	public String getFirstName() {
		return firstName;
	}	
	public String getLastName() {
		return lastName;
	}
	
	//Setter
	
	public void setStudentId(int id)
	{
		this.studentId = id;
	}	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
}
