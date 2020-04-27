package com.vyom.spinghaldemo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vyom.spinghaldemo.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {	
	
	List<Student> findBySchoolName(@Param(value = "schoolName") String schoolName);
	Student findById(@Param(value="id")long id);

}
