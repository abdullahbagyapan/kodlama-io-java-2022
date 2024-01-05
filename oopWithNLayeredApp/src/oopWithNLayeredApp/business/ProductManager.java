package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.LoggerI;
import oopWithNLayeredApp.dataAccess.ProductDaoI;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

    private ProductDaoI productDao;

    private List<LoggerI> loggers;

    public ProductManager(ProductDaoI productDao,List<LoggerI> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void insert(Product product) {
        

        if (product.getUnitPrice() < 10) {
            throw new IllegalArgumentException("The unit price cannot be less than 10");
        }

        productDao.insert(product);

        loggers.forEach(logger -> logger.log(product.getName()));
    }
    
}
