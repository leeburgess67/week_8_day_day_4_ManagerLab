import db.DBDepartment;
import db.DBHelper;
import db.DBManager;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {



        Manager manager1 = new Manager("Lee", "A1", 40000, 2000000);

        Department department1 = new Department("Fresh foods", manager1);
        Product banana = new Product("Bananas",2.50, department1);

        Administrator administrator1 = new Administrator("Edward", "J2", 30000, manager1);
        Administrator administrator2 = new Administrator("Zsolt", "J3", 20000, manager1);

        DBHelper.save(manager1);
        DBHelper.save(administrator1);
        DBHelper.save(administrator2);
        DBHelper.save(department1);
        DBHelper.save(banana);


        List<Employee> foundEmployees =  DBManager.getEmployeesForManager(manager1);
        Department foundDepartment = DBManager.getDepartmentForManager(manager1);

        List<Product> foundProducts = DBDepartment.getProductsFromDepartment(department1);

    }

}
