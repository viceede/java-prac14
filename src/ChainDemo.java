public class ChainDemo {
    public static void main(String[] args) {
        // Создаем обработчики
        Logger debugLogger = new DebugLogger();
        Logger consoleLogger = new ConsoleLogger();
        Logger warningLogger = new WarningLogger();
        Logger errorLogger = new ErrorLogger();
        Logger criticalLogger = new CriticalLogger();

        // Строим цепочку
        debugLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(criticalLogger);

        System.out.println("=== Цепочка обработчиков создана ===");
        System.out.println("Порядок: DEBUG -> INFO -> WARNING -> ERROR -> CRITICAL\n");

        // Тестовые сообщения разных уровней
        System.out.println("1. Логирование DEBUG:");
        debugLogger.logMessage(LogLevel.DEBUG, "Это отладочное сообщение");

        System.out.println("\n2. Логирование INFO:");
        debugLogger.logMessage(LogLevel.INFO, "Информационное сообщение");

        System.out.println("\n3. Логирование WARNING:");
        debugLogger.logMessage(LogLevel.WARNING, "Предупреждение");

        System.out.println("\n4. Логирование ERROR:");
        debugLogger.logMessage(LogLevel.ERROR, "Ошибка в системе");

        System.out.println("\n5. Логирование CRITICAL:");
        debugLogger.logMessage(LogLevel.CRITICAL, "Критическая ошибка!");
    }
}