import db.DBHelper;
import models.Administrator;
import models.Manager;

public class Runner {

    public static void main(String[] args) {


        Manager manager1 = new Manager("Lee", "A1", 40000, 2000000, "food");

        Administrator administrator1 = new Administrator("Edward", "J2", 30000, manager1);
        Administrator administrator2 = new Administrator("Zsolt", "J3", 20000, manager1);

        DBHelper.save(manager1);
        DBHelper.save(administrator1);
        DBHelper.save(administrator2);

        System.out.println("hi");

    }

}
