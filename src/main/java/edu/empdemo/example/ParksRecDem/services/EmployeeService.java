package edu.empdemo.example.ParksRecDem.services;

import edu.empdemo.example.ParksRecDem.model.Employee;
import edu.empdemo.example.ParksRecDem.repositories.EmployeeJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeJdbcRepository employeeRepository;

    public Employee getEmployeeWithId(Integer empId) {
        return employeeRepository.findByEmployeeId(empId).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee newEmployee) {
        List<Employee> allEmps = getAllEmployees();
        Integer newEmpId = allEmps.stream().map(x -> x.getEmployeeId()).reduce(Integer.MIN_VALUE, (x, y) -> (x > y)?x: y) + 1;
        System.out.println("New EmpId = " + newEmployee.getEmployeeId() + ".New Emp Name = " + newEmployee.getFirstName());
        if (newEmployee.getEmployeeId() == null) {
            newEmployee.setEmployeeId(newEmpId);
        }
        return employeeRepository.save(newEmployee);
    }

    public Employee updateEmployee(Integer empId, Employee modifiedEmployee) {
        Employee oldEmployee = getEmployeeWithId(empId);
        oldEmployee.setAge(modifiedEmployee.getAge());
        oldEmployee.setBirthdate(modifiedEmployee.getBirthdate());
        oldEmployee.setGender(modifiedEmployee.getGender());
        oldEmployee.setFirstName(modifiedEmployee.getFirstName());
        oldEmployee.setLastName(modifiedEmployee.getLastName());
        return employeeRepository.save(oldEmployee);
    }

}
