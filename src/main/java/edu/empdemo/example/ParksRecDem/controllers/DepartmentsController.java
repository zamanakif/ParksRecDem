package edu.empdemo.example.ParksRecDem.controllers;

import edu.empdemo.example.ParksRecDem.model.Department;
import edu.empdemo.example.ParksRecDem.services.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parksdepartments/depts/")
public class DepartmentsController {

    @Autowired
    private DepartmentsService departmentsService;

    @GetMapping("/test")
    public String testResponse() {
        return "Hello Parks & Rec world";
    }

    @GetMapping("/{deptId}")
    public Department getDepartmentWithId(@PathVariable("deptId") Integer departmentId) {
        System.out.println("Department id passed is " + departmentId);
        return departmentsService.getDepartmentWithId(departmentId);
    }

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return departmentsService.getAllDepartments();
    }

    @PostMapping("/")
    public Department createNewDepartment(@RequestBody Department parksDepartment) {
        return departmentsService.createDepartment(parksDepartment);
    }

    @PutMapping("/depts/{deptId}")
    public Department updateDepartment(@PathVariable("deptId") Integer deptId, @RequestBody Department updatedDepartment) {
        return departmentsService.updateDepartment(deptId, updatedDepartment);
    }
}
