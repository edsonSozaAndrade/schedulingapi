package com.scheduling.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scheduling.common.Response;
import com.scheduling.dao.ClassStudentDao;
import com.scheduling.dao.SchoolClassDao;
import com.scheduling.dao.StudentDao;
import com.scheduling.model.ClassStudent;

@Component
public class ClassStudentManager {
	@Autowired
	private ClassStudentDao _studentClassDao;
	@Autowired
	private StudentDao _studentDao;
	@Autowired
	private SchoolClassDao _schoolClassDao;
	
	public Response Assign(ClassStudent model) {
		Response response = new Response();
		try
		{
			_studentClassDao.save(model);
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
	
	public Response StudentsByClass(Integer classCode) {
		Response response = new Response();
		try
		{
			response.setIsCorrect(true);
			response.setContent(_studentDao.findStudentByClass(classCode));
		}
		catch(Exception e)
		{
			response.setIsCorrect(false);
			response.setContent(e.getMessage());
		}
		return response;
	}
	
	public Response ClassesByStudent(Integer studentId) {
		Response response = new Response();
		try
		{
			response.setIsCorrect(true);
			response.setContent(_schoolClassDao.findClassesByStudent(studentId));
		}
		catch(Exception e)
		{
			response.setIsCorrect(false);
			response.setContent(e.getMessage());
		}
		return response;
	}
}
