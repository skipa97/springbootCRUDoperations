package tutorial.spring.springdemo.service;

import org.springframework.stereotype.Service;
import tutorial.spring.springdemo.model.Employee;

import java.util.List;

@Service
public interface EmployeeService {

    List<Employee> getEmployees();
}
