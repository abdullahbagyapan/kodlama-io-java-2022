package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {


        Product product = new Product(1,"Iphone X",870.90);


        JdbcProductDao productDao = new JdbcProductDao();
        ProductManager productManager = new ProductManager(productDao);
        productManager.insert(product);

        
    }
}
