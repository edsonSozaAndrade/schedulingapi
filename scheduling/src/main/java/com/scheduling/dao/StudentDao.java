package com.scheduling.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.scheduling.model.Student;

public interface StudentDao extends CrudRepository<Student,Integer>{
	@Query("SELECT st FROM ClassStudent cs JOIN Student st ON cs.student.studentId = st.studentId where cs.schoolClass.code = :code") 
    List<Student> findStudentByClass(@Param("code") Integer code);
	List<Student> findAllByStudentIdLikeOrFirstNameLikeOrLastNameLike(Integer StudentId,String FirstName, String LastName);
}
