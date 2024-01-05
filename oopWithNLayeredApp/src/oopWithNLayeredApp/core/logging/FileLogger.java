package oopWithNLayeredApp.core.logging;

public class FileLogger implements LoggerI{

    @Override
    public void log(String message) {
        System.out.println("FileLogger:" + message);
    }
}
