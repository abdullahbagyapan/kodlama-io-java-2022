package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

    public void insert(Product product) {
        

        if (product.getUnitPrice() < 10) {
            throw new IllegalArgumentException("The unit price cannot be less than 10");
        }

        JdbcProductDao productDao = new JdbcProductDao();
        productDao.insert(product);
    }
    
}
