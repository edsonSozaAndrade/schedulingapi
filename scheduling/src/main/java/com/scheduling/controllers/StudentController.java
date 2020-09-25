package com.scheduling.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scheduling.common.Response;
import com.scheduling.managers.StudentManager;
import com.scheduling.model.Student;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentManager studentManager;	
	
	public StudentController()
	{
		studentManager = new StudentManager();
	}
	
	@PostMapping("/create")
	public Response Create(@RequestBody Student model) {
		return studentManager.Create(model);
	}
	
	@GetMapping("/list")
	public Response ListAllStudents(){
		return studentManager.ListAllStudents();
	}
	
	@DeleteMapping("/delete/{id}")
	public Response DeleteStudent(@PathVariable("id") Integer id){
		return studentManager.DeleteStudent(id);
	}
	
	@PutMapping("/update")
	public Response UpdateStudent(@RequestBody Student model){
		return studentManager.UpdateStudent(model);
	}
	
	@PostMapping("/find")
	public Response FindStudent(@RequestBody Student model){
		return studentManager.FindStudent(model);
	}
}
