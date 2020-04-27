package com.vyom.spinghaldemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vyom.spinghaldemo.models.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository repository;
	
	@GetMapping(value="/student/{id}", produces = "application/json")
	public ResponseEntity<Student> getStudentDetails(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id));
	}
	
	@GetMapping(value = "student/school/{schoolname}", produces="application/json")
	public ResponseEntity<List<Student>> getStudentsBySchoolName(@PathVariable String schoolname){
		return ResponseEntity.ok(repository.findBySchoolName(schoolname));
	}

}
