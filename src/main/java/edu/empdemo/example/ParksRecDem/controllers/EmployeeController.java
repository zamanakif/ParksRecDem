package edu.empdemo.example.ParksRecDem.controllers;

import edu.empdemo.example.ParksRecDem.model.Employee;
import edu.empdemo.example.ParksRecDem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parksdepartments/employees/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/empId/{empId}")
    public Employee getEmployee(@PathVariable("empId") Integer empId) {
        return employeeService.getEmployeeWithId(empId);
    }

    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/")
    public Employee createNewEmployee(@RequestBody Employee newEmployee) {
        return employeeService.createEmployee(newEmployee);
    }

    @PutMapping("/{empId}")
    public Employee updateEmployeeDetails(@PathVariable("empId") Integer empId, @RequestBody Employee modifiedEmployee) {
        return employeeService.updateEmployee(empId, modifiedEmployee);
    }

    /*
    {
    "firstName": "Bill",
    "lastName": "Gates",
    "age": 69,
    "gender": "Male",
    "birthdate": "1955-10-28"
}
    */

    /*
    public Employee getEmployeeWithId(Integer empId) {
        return employeeRepository.findByEmployeeId(empId).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }

    public Employee updateEmployee(Integer empId, Employee modifiedEmployee) {
    */
}
