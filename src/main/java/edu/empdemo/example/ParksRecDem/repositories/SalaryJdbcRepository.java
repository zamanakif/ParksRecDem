package edu.empdemo.example.ParksRecDem.repositories;

import edu.empdemo.example.ParksRecDem.model.Salary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SalaryJdbcRepository extends CrudRepository<Salary, Integer> {

    List<Salary> findAll();
    Optional<Salary> findByEmployeeId(Integer employeeId);
    Salary save(Salary salary);


}
