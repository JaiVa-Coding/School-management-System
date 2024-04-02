package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.domain.Department;
import com.example.dto.DepartmentDto;
import com.example.repository.DepartmentRepository;

public class DepartmentServiceImpl implements DepartmentService{

     @Autowired
     private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(DepartmentDto depDto) {
		Department dep = new Department(depDto);
		return departmentRepository.save(dep);
	}
	@Override
	public List<Department> getAllDepartments() {
		
		return departmentRepository.findAll();
	}

}
