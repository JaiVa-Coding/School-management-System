package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Department;
import com.example.dto.DepartmentDto;
import com.example.service.DepartmentService;


@RestController
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/saveDepartment")
	public ResponseEntity<Department> save(@RequestBody DepartmentDto depDto){
		//DepartmentDto depdto = new DepartmentDto(dep);
		Department dep = departmentService.saveDepartment(depDto);
		return new ResponseEntity<>(dep, HttpStatus.CREATED);
	}
	
	@GetMapping("/getalldepartments") 
	public ResponseEntity<List<Department>> getDepartments() { 
	  List<Department> depList = departmentService.getAllDepartments(); 
	  return new ResponseEntity<>(depList,HttpStatus.OK); 
	}

}