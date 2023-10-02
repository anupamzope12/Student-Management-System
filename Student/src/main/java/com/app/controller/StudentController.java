package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.StudentDto;
import com.app.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studServ;
	
	@GetMapping
	public ResponseEntity<?> getAllStudent(){
		return ResponseEntity.status(HttpStatus.OK).body(studServ.getAllStudents());
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addStudent(@RequestBody StudentDto stud){
		return ResponseEntity.status(HttpStatus.OK).body(studServ.addStudent(stud));
	}
	
}
