package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.Student;
import com.example.dto.StudentDto;

@Service
public interface StudentService {

	public Student getStudentById(Long studentId);
	
	public List<Student> getAllStudents();

	public Student saveStudent(StudentDto studto);

}
