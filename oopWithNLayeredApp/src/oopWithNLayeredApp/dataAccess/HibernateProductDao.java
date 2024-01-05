package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao {
    

        public void insert(Product product) {
        System.out.println("Inserted to DB by Hibernate");
    }

}
