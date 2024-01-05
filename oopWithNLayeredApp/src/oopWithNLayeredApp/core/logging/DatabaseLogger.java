package oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements LoggerI{
    
    @Override
    public void log(String message) {
        System.out.println("DatabaseLogger :" + message);
    }
}
