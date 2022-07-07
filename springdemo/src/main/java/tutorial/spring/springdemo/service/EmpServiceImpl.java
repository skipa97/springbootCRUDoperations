package tutorial.spring.springdemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorial.spring.springdemo.Repository.EmployeeRepo;
import tutorial.spring.springdemo.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee>getEmployees(){
        return employeeRepo.findAll();
    }

}
