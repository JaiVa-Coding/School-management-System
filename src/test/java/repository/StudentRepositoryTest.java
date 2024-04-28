package repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.domain.Department;
import com.example.domain.Student;
import com.example.repository.StudentRepository;

@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@BeforeEach
	void setup() {
		Student student = new Student(44l,"karan", "johar", new Department(1, "Software developer"));
		entityManager.persist(student);
	}
	
	@Test
	public void testFindById() {
		Student stu = studentRepo.findById(44l).get();
		assertEquals("karan", stu.getFirstName());
        assertEquals("johar", stu.getLastName());
	}


}
