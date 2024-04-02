package com.example.dto;

import com.example.domain.Department;

public class StudentDto {

    	private Long stuId;
    
    private String firstName;
    private String lastName;
    
    private Department departmentId;

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
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

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "StudentDto [stuId=" + stuId + ", firstName=" + firstName + ", lastName=" + lastName + ", departmentId="
                + departmentId + "]";
    }


    

}
