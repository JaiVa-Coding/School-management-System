package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.Department;

@Service
public interface DepartmentService {

     List<Department> getAllDepartments();
	
	Department saveDepartment(Department department);
	
	Department getDepartmentById(Long id);
	
	Department updateDepartment(Department department);
	
	void deleteDepartmentById(Long id);

}
