package tutorial.spring.springdemo.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@ToString
@Entity
@Table(name="employee")
public class Employee {

    @Id
    private Long id;
    private int salary;
    private String name;
}
