package edu.empdemo.example.ParksRecDem.controllers;


import edu.empdemo.example.ParksRecDem.model.Salary;
import edu.empdemo.example.ParksRecDem.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestMapping("/parksdepartments/salaries/")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping("/emp/{empId}")
    public Salary getSalaryDetailsForEmpId(@PathVariable("empId") Integer empId) {
        return salaryService.getSalaryDetailsForEmpId(empId);
    }

    @GetMapping("/")
    public List<Salary> getAllEmpSalaries() {
        return salaryService.getAllSalaryDetails();
    }
    @PutMapping("/emp/{empId}")
    public Salary updateEmpSalary(@PathVariable("empId") Integer empId, @RequestBody Salary updatedSalary) {
        return salaryService.updateSalaryDetail(empId, updatedSalary);
    }

    @PostMapping("/emp/")
    public Salary createNewSalaryRecord(@RequestBody Salary newSalaryRecord) {
        return salaryService.saveNewSalaryDetail(newSalaryRecord);
    }

}
