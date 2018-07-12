package db;

import models.Department;
import models.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBDepartment {

    private static Session session;

    public static List<Product> getProductsFromDepartment(Department department) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Product> products = null;
        try {
            Criteria cr = session.createCriteria(Product.class);
            cr.add(Restrictions.eq("department", department));
            products = cr.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return products;
    }


}
