package designPattern.structural.adapter.sample;

public class Main {
    public static void main(String[] args) {
        // Usage
        Logger logger = new LoggerAdapter(new LegacyLogger());
        logger.log("Hello, Adapter Pattern!");
    }
}
