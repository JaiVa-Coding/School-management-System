package repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.domain.Department;

@DataJpaTest
public class DepartmentRepositoryTest {

 
	
	@Autowired
	private DepartmentRepositoryTest departmentRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@BeforeEach
	void setup() {
		Department department = new Department(1, "Software developer");
		entityManager.persist(department);
	}
	
	@Test
	public void testFindById() {
		Department dep = departmentRepository.findById(44l).get();
		assertEquals("Software developer", dep.getDepartmentName());
	}


}
