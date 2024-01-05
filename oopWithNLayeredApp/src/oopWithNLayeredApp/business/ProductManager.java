package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.ProductDaoI;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

    private ProductDaoI productDao;
    // loose dependency
    public ProductManager(ProductDaoI productDao) {
        this.productDao = productDao;
    }

    public void insert(Product product) {
        

        if (product.getUnitPrice() < 10) {
            throw new IllegalArgumentException("The unit price cannot be less than 10");
        }

        productDao.insert(product);
    }
    
}
