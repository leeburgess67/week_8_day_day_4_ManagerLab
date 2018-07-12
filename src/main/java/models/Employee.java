package models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "employee_type")
public abstract class Employee {

    private int id;
    private String name;
    private String niNo;
    private int salary;

    public Employee(){}

    public Employee(String name, String niNo, int salary){
        this.name = name;
        this.niNo = niNo;
        this.salary = salary;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "ni_no")
    public String getNiNo() {
        return niNo;
    }

    public void setNiNo(String niNo) {
        this.niNo = niNo;
    }
    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
