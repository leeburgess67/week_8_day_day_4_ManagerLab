package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    private int id;
    private String title;
    private Manager manager;
    private List<Product> products;

    public Department(){}

    public Department(String title, Manager manager, List<Product> products){
        this.title = title;
        this.manager = manager;
        this.products = new ArrayList<Product>();

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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }


    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
