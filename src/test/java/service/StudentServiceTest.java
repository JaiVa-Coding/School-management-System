package service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.domain.Department;
import com.example.domain.Student;
import com.example.dto.StudentDto;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@SpringBootTest
public class StudentServiceTest {


    @Autowired
	private StudentService stuService;
	
	@MockBean
	private StudentRepository stuRepo;
	
	@BeforeEach
	void setup() {
		Optional<Student> employee = Optional.of(new Student(300l,"chaitanya", "reddy", new Department(1, "Software developer")));
		Mockito.when(stuRepo.findById(103l)).thenReturn(employee);
	}
	
	@Test
	public void getEmployeeById_Success() {
		String stuFirstName = "chaitanya";
        String stuLastName = "reddy";
		StudentDto stu = stuService.findEmployeeById(300l);
		assertEquals(stuFirstName,stu.getFirstName());
        assertEquals(stuLastName,stu.getLastName());

	}

}
