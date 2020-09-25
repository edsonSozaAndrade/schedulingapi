package com.scheduling.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scheduling.common.Response;
import com.scheduling.dao.StudentDao;
import com.scheduling.model.Student;

@Component
public class StudentManager {
	@Autowired
	private StudentDao _studentDao;

	public Response Create(Student model) {
		Response response = new Response();
		try
		{
			_studentDao.save(model);
			response.setIsCorrect(true);
			response.setContent(model);
		}
		catch(Exception e)
		{
			response.setIsCorrect(false);
			response.setContent(e.getMessage());
		}
		return response;
	}
	
	public Response ListAllStudents(){
		Response response = new Response();
		try
		{
			response.setIsCorrect(true);
			response.setContent((List<Student>) _studentDao.findAll());
		}
		catch(Exception e)
		{
			response.setIsCorrect(false);
			response.setContent(e.getMessage());
		}
		return response;
	}
	
	public Response DeleteStudent(Integer id){
		Response response = new Response();
		try
		{
			_studentDao.deleteById(id);
			response.setIsCorrect(true);
			response.setContent(id);
		}
		catch(Exception e)
		{
			response.setIsCorrect(false);
			response.setContent(e.getMessage());
		}		
		return response;		
	}
	
	public Response UpdateStudent(Student model){
		Response response = new Response();
		try
		{
			_studentDao.save(model);
			response.setIsCorrect(true);
			response.setContent(model);
		}
		catch(Exception e)
		{
			response.setIsCorrect(false);
			response.setContent(e.getMessage());
		}				
		return response;
	}
	
	public Response FindStudent(Student model){
		Response response = new Response();
		try
		{
			response.setIsCorrect(true);
			response.setContent(_studentDao.findAllByStudentIdLikeOrFirstNameLikeOrLastNameLike(model.getStudentId(),
					model.getFirstName(),
					model.getLastName()));
		}
		catch(Exception e)
		{
			response.setIsCorrect(false);
			response.setContent(e.getMessage());
		}				
		return response;
	}
}
