package tutorial.spring.springdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tutorial.spring.springdemo.model.Employee;
import tutorial.spring.springdemo.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService eService;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){

        return eService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable("id") Long id){

        return "This will fetch the employee with an id "+ id;
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){

        return "Saving to db "+employee;
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        System.out.println("updating employee data "+ id);
        return employee;

    }

    @DeleteMapping("/employees")
    public String deleteEmployee (@RequestParam("id") Long id){
        return "This will delete the employee with an id "+ id;
    }

}
