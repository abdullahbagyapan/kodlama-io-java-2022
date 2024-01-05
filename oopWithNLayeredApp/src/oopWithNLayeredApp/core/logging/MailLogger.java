package oopWithNLayeredApp.core.logging;

public class MailLogger implements LoggerI {
    @Override
    public void log(String message) {
        System.out.println("MailLogger: " + message);
    }
}
