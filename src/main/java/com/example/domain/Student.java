package com.example.domain;

import org.springframework.data.annotation.Id;

import com.example.dto.StudentDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Table(name = "Student")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long studentId;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "department_Id")
    private Department departmentId;
   

    public Student() {
		super();
		
	}

    public Student(StudentDto studto) {
		super();
		this.studentId = studto.getStuId();
		this.firstName = studto.getFirstName();
		this.lastName = studto.getLastName();
		this.departmentId = studto.getDepartmentId();
	}

    @JoinColumn(name = "department_id", referencedColumnName = "studentId")
    private Department department;

    public Long getId() {
        return studentId;
    }

    public void setId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student [id=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
                + department + "]";
    }


}
