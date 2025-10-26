package designPattern.structural.adapter.sample;

public class LoggerAdapter implements Logger {
    private LegacyLogger legacyLogger;

    public LoggerAdapter(LegacyLogger legacyLogger) {
        this.legacyLogger = legacyLogger;
    }

    @Override
    public void log(String message) {
        legacyLogger.writeLog(message);  // Adapting the method call
    }
}
