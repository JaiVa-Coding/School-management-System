package com.example.service;

import java.util.List;

import com.example.domain.Department;
import com.example.repository.DepartmentRepository;

public class DepartmentServiceImpl {

     private DepartmentRepository departmentRepository;


    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
        
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.getReferenceById(id);
    }

    public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}

    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }

}
