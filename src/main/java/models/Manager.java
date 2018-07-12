package models;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TypeDefParticle;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {

    private int budget;
    private Department department;
    private List<Administrator> administrators;

    public Manager() {}

    public Manager(String name, String niNo, int salary, int budget) {
        super(name, niNo, salary);
        this.budget = budget;
        this.department = department;
        this.administrators = new ArrayList<Administrator>();
    }

    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @OneToOne(mappedBy = "manager", fetch = FetchType.LAZY)
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<Administrator> administrators) {
        this.administrators = administrators;
    }
}
