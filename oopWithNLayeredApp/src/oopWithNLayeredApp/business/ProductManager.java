package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.ProductDaoI;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

    public void insert(Product product) {
        

        if (product.getUnitPrice() < 10) {
            throw new IllegalArgumentException("The unit price cannot be less than 10");
        }

        ProductDaoI productDao = new HibernateProductDao();
        productDao.insert(product);
    }
    
}
