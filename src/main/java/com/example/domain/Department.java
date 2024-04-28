package com.example.domain;

import com.example.dto.DepartmentDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depId;
    
    @Column(name = "department_name" )
    private String departmentName;

    @Column(name = "description")
    private String description;


    public Department(int i, String string) {
		super();
		
	}
	

	public Department(Long depId, String departmentName, String description) {
		super();
		this.depId = depId;
		this.departmentName = departmentName;
        this.description = description;
	}


    public Department(DepartmentDto depDto) {
		super();
		this.depId = depDto.getDepartmentId();
		this.departmentName = depDto.getDepartmentName();
	}

    @Override
    public String toString() {
        return "Department [id=" + depId + ", departmentName=" + departmentName + ", description=" + description + "]";
    }


    public Long getDepId() {
        return depId;
    }


    public void setDepId(Long depId) {
        this.depId = depId;
    }


    public String getDepartmentName() {
        return departmentName;
    }


    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    




}
