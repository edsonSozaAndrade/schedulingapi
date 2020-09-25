package com.scheduling.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scheduling.common.Response;
import com.scheduling.dao.SchoolClassDao;
import com.scheduling.model.SchoolClass;

@Component
public class ClassManager {
	@Autowired
	private SchoolClassDao _classDao;
	
	public Response Create(SchoolClass model) {
		Response response = new Response();
		try
		{
			_classDao.save(model);
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
	
	public Response ListAllClasses(){
		Response response = new Response();
		try
		{
			response.setIsCorrect(true);
			response.setContent((List<SchoolClass>) _classDao.findAll());
		}
		catch(Exception e)
		{
			response.setIsCorrect(false);
			response.setContent(e.getMessage());
		}
		return response;
	}
	
	public Response DeleteClass(Integer id){
		Response response = new Response();
		try
		{
			_classDao.deleteById(id);
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
	
	public Response UpdateClass(SchoolClass model){
		Response response = new Response();
		try
		{
			_classDao.save(model);
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
	
	public Response FindClass(SchoolClass model){
		Response response = new Response();
		try
		{
			response.setIsCorrect(true);
			response.setContent(_classDao.findAllByCodeLikeOrTitleLikeOrDescriptionLike(model.getCode(), 
					model.getTitle(), 
					model.getDescription()));
		}
		catch(Exception e)
		{
			response.setIsCorrect(false);
			response.setContent(e.getMessage());
		}				
		return response;
	}
}
