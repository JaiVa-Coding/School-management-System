package service;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
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


}
