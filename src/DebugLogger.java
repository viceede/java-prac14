public class DebugLogger extends Logger {
    public DebugLogger() {
        super(LogLevel.DEBUG);
    }

    @Override
    protected void write(String message) {
        System.out.println("[DEBUG] Debug Logger: " + message);
    }
}