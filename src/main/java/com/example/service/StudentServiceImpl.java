package com.example.service;

import java.util.List;

import com.example.domain.Student;
import com.example.repository.StudentRepository;


public class StudentServiceImpl {

    private StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
        
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.getReferenceById(id);
    }

    public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


}
