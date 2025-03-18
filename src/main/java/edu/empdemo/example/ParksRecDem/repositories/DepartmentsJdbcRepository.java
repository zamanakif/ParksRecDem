package edu.empdemo.example.ParksRecDem.repositories;

import edu.empdemo.example.ParksRecDem.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentsJdbcRepository extends CrudRepository<Department, Integer> {

    @SuppressWarnings("NullableProblems")


    List<Department> findAll();
    Optional<Department> findByDeptId(Integer departmentId);
    Department save(Department parksDepartment);
}
