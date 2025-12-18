public class ConsoleLogger extends Logger {
    public ConsoleLogger() {
        super(LogLevel.INFO);
    }

    @Override
    protected void write(String message) {
        System.out.println("[INFO] Console Logger: " + message);
    }
}