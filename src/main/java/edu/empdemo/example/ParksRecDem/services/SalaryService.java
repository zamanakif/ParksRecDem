package edu.empdemo.example.ParksRecDem.services;

import edu.empdemo.example.ParksRecDem.model.Salary;
import edu.empdemo.example.ParksRecDem.repositories.SalaryJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryService {

    @Autowired
    private SalaryJdbcRepository salaryRepository;

    public Salary getSalaryDetailsForEmpId(Integer empId) {
        Optional<Salary> salaryDetailsOpt = salaryRepository.findByEmployeeId(empId);
        return salaryDetailsOpt.orElse(null);
    }

    public List<Salary> getAllSalaryDetails() {
        return salaryRepository.findAll();
    }

    public Salary saveNewSalaryDetail(Salary newSalary) {
        return salaryRepository.save(newSalary);
    }

    public Salary updateSalaryDetail(Integer empId, Salary newSalaryDetail) {
        Salary oldSalaryDetail = getSalaryDetailsForEmpId(empId);
        salaryRepository.delete(oldSalaryDetail);
        oldSalaryDetail.setSalary(newSalaryDetail.getSalary());
        oldSalaryDetail.setOccupation(newSalaryDetail.getOccupation());
        oldSalaryDetail.setDeptId(newSalaryDetail.getDeptId());
        oldSalaryDetail.setFirstName(newSalaryDetail.getFirstName());
        oldSalaryDetail.setLastName(newSalaryDetail.getLastName());
        return salaryRepository.save(oldSalaryDetail);
    }



    /*

    List<Salary> findAll();
    Optional<Salary> findByEmployeeId(Integer employeeId);
    Salary save(Salary salary);
    */

}

