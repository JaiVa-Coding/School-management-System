package com.example.dto;

public class DepartmentDto {
    
    private Long departmentId;
	
	private String departmentName;
    private String description;



	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
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

    @Override
    public String toString() {
        return "DepartmentDto [departmentId=" + departmentId + ", departmentName=" + departmentName + ", description="
                + description + "]";
    }



    
}


