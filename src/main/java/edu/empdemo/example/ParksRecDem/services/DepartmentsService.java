package edu.empdemo.example.ParksRecDem.services;

import edu.empdemo.example.ParksRecDem.model.Department;
import edu.empdemo.example.ParksRecDem.repositories.DepartmentsJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentsService {
    @Autowired
    private DepartmentsJdbcRepository departmentsJdbcRepository;

    public Department getDepartmentWithId(Integer departmentId) {
        Optional<Department> optionalParksDepartments = departmentsJdbcRepository.findByDeptId(departmentId);
        Department parksDepartment = optionalParksDepartments.orElse(null);
        System.out.println("Service parksDepartment obtained = " + parksDepartment);
        return parksDepartment;
    }

    public List<Department> getAllDepartments() {
        return departmentsJdbcRepository.findAll();
    }

    public Department createDepartment(Department parksDepartment) {
        return departmentsJdbcRepository.save(parksDepartment);
    }

    public Department updateDepartment(Integer deptId, Department modifiedDepartment) {
        Department oldDepartment = getDepartmentWithId(deptId);
        departmentsJdbcRepository.deleteById(deptId);
        oldDepartment.setDeptId(deptId);
        oldDepartment.setDeptName(modifiedDepartment.getDeptName());
        return departmentsJdbcRepository.save(oldDepartment);
    }

}
