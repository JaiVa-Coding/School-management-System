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
import com.example.repository.DepartmentRepository;
import com.example.service.DepartmentService;

@SpringBootTest
public class DepartmentServiceTest {

    @Autowired
	private DepartmentService depService;
	
	@MockBean
	private DepartmentRepository depRepo;
	
	@BeforeEach
	void setup() {
		Optional<Department> department = Optional.of(new Department(1, "Software developer"));
		Mockito.when(depRepo.findById(301l)).thenReturn(department);
	}
	
	@Test
	public void getStudentById_Success() {
		String depName = "Software developer";
		Department dep = depService.findById(301l);
		assertEquals(depName,dep.getDepartmentName());
	}

}
