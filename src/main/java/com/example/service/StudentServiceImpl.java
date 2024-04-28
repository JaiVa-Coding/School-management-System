package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.domain.Student;
import com.example.dto.StudentDto;
import com.example.repository.StudentRepository;


public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;


	@Override
	public Student getStudentById(Long studentId) {
		
		return studentRepository.findById(studentId).get();
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

    @Override
    public Student saveStudent(StudentDto studto) {
    	Student stu = new Student(studto);
		return studentRepository.save(stu);
    }



}
