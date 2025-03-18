package edu.empdemo.example.ParksRecDem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table("employee_salary")
public class Salary {

    @Id
    @Column("employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Column("first_name")
    private String firstName;

    @Column("last_name")
    private String lastName;

    @Column("occupation")
    private String occupation;

    @Column("salary")
    private Double salary;

    @Column("dept_id")
    private Integer deptId;

    @Override
    public String toString() {
        return "{\n\"employeeId\": " + this.getEmployeeId() + ",\n"
                + "\"firstName\": \"" + this.getFirstName() + ",\"\n"
                + "\"lastName\": \"" + this.getLastName() + ",\"\n"
                + "\"occupation\": \"" + this.getOccupation() + ",\"\n"
                + "\"salary\": " + this.getDeptId() + "\n}";
    }
}
