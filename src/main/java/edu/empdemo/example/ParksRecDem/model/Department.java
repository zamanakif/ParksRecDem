package edu.empdemo.example.ParksRecDem.model;

//import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
//import org.springframework.data.annotation.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table("parks_departments")
public class Department {

    @Id
    @Column("department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptId;

    @Column("department_name")
    private String deptName;

    public Department() {
        super();
        System.out.println("Def constructor");
    }

    public Department(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    /*
    //Keep this in case Lombok starts giving issues
    public Integer getDeptId() {
        return this.deptId;
    }
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return this.deptName;
    }
    */
    @Override
    public String toString() {
        return "{\n\"deptId\": " + this.getDeptId() + ",\n" +
                "\"deptName\": \"" + this.getDeptName() + "\"\n}";
    }

}
