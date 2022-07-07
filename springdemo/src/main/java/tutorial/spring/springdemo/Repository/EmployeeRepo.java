package tutorial.spring.springdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tutorial.spring.springdemo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
