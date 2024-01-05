package oopWithNLayeredApp;

import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.LoggerI;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {


        Product product = new Product(1,"Iphone X",870.90);


        JdbcProductDao productDao = new JdbcProductDao();
        List<LoggerI> loggers = List.of(new DatabaseLogger(),new FileLogger(),new MailLogger());

        ProductManager productManager = new ProductManager(productDao,loggers);
        productManager.insert(product);

        
    }
}
