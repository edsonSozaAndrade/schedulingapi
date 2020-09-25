package com.scheduling.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.scheduling.model.SchoolClass;

public interface SchoolClassDao extends CrudRepository<SchoolClass, Integer>{
	@Query("SELECT sc FROM ClassStudent cs JOIN SchoolClass sc ON cs.student.studentId = sc.code where cs.student.studentId = :studentId") 
    List<SchoolClass> findClassesByStudent(@Param("studentId") Integer studentId);
	List<SchoolClass> findAllByCodeLikeOrTitleLikeOrDescriptionLike(Integer code,String Title,String Description);
}
