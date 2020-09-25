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
import com.scheduling.managers.ClassManager;
import com.scheduling.model.SchoolClass;

@RestController
@RequestMapping("class")
public class SchoolClassController {
	
	@Autowired
	private ClassManager classManager;	
	
	public SchoolClassController()
	{
		classManager = new ClassManager();
	}
	
	@PostMapping("/create")
	public Response CreateClass(@RequestBody SchoolClass model) {
		return classManager.Create(model);
	}
	
	@GetMapping("/list")
	public Response ListAllClasses(){
		return classManager.ListAllClasses();
	}
	
	@DeleteMapping("/delete/{id}")
	public Response DeleteClass(@PathVariable("id") Integer id){
		return classManager.DeleteClass(id);
	}
	
	@PutMapping("/update")
	public Response UpdateClass(@RequestBody SchoolClass model){
		return classManager.UpdateClass(model);
	}
	
	@PostMapping("/find")
	public Response FindClass(@RequestBody SchoolClass model){
		return classManager.FindClass(model);
	}
}
