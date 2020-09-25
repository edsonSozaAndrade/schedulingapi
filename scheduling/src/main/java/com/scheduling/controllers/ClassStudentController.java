package com.scheduling.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scheduling.common.Response;
import com.scheduling.managers.ClassStudentManager;
import com.scheduling.model.ClassStudent;

@RestController
@RequestMapping("studentclass")
public class ClassStudentController {
	@Autowired 
	private ClassStudentManager classStudentManager;
	
	public ClassStudentController()
	{
		classStudentManager = new ClassStudentManager();
	}
	
	@PostMapping("/assign")
	public Response Assign(@RequestBody ClassStudent model) {
		return classStudentManager.Assign(model);
	}
	
	@GetMapping("/studentbyclass/{id}")
	public Response ListAllStudentsClasses(@PathVariable("id") Integer id){
		return classStudentManager.StudentsByClass(id);
	}
	
	@GetMapping("/classbystudent/{id}")
	public Response ListAllClassesByStudent(@PathVariable("id") Integer id){
		return classStudentManager.ClassesByStudent(id);
	}
}
