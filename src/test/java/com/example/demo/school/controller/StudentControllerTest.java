package com.example.demo.school.controller;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.controller.StudentController;
import com.example.domain.Department;
import com.example.dto.StudentDto;
import com.example.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {

    @Autowired
    private StudentController studentController;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService studentService;

    private StudentDto student;

    @BeforeEach
    void setup() {
        Department dep = new Department();
        dep.setDepId((long) 1);
        StudentDto student = new StudentDto();
        student.setDepartmentId(dep);
        student.setFirstName("Jay");
        student.setLastName("Rao");
        student.setStuId((long) 1);

    }

    



}
