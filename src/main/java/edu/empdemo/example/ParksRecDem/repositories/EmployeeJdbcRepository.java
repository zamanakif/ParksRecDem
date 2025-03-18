package edu.empdemo.example.ParksRecDem.repositories;

import edu.empdemo.example.ParksRecDem.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeJdbcRepository  extends CrudRepository<Employee, Integer> {
    List<Employee> findAll();

    Optional<Employee> findByEmployeeId(Integer empId);

    Employee save(Employee employee);

    /*
    List<ParksDepartments> findAll();

    Optional<ParksDepartments> findByDeptId(Integer departmentId);

    ParksDepartments save(ParksDepartments parksDepartment);
    */
}
