package models;

import com.sun.scenario.effect.impl.prism.PrDrawable;
import org.hibernate.criterion.Projections;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    private int id;
    private String description;
    private double price;
    private Department department;


    public Product(){}

    public Product(String description, double price, Department department){
        this.description = description;
        this.price = price;
        this.department = department;
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

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
