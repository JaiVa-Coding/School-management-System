package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Student;
import com.example.dto.StudentDto;
import com.example.service.StudentService;




@RestController
public class StudentController {

    @Autowired
	StudentService studentService;
	
	@GetMapping("/getallstudents") 
	public ResponseEntity<List<Student>> getStudents() { 
	  List<Student> studentList = studentService.getAllStudents(); 
	  return new ResponseEntity<>(studentList, HttpStatus.OK); 
	}
	
	@GetMapping("/getstudent") 
	public ResponseEntity<Student> getStudentById(@RequestParam Long id) { 
		Student stu = studentService.getStudentById(id); 
		return new ResponseEntity<>(stu,HttpStatus.OK); 
	}
	
	@PostMapping("/savestudent") 
	public ResponseEntity<Student> saveStudent(@RequestBody StudentDto studto) { 
		Student student = studentService.saveStudent(studto); 
		return new ResponseEntity<>(student,HttpStatus.OK); 
	}





}
