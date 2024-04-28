package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.Department;
import com.example.dto.DepartmentDto;

@Service
public interface DepartmentService {
	Department saveDepartment(DepartmentDto dep);

	List<Department> getAllDepartments();

}
