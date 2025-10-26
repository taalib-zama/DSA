package designPattern.creational.builder;


import java.time.Duration;

public class ServerConfig {
    private final String host;
    private final int port;
    private final boolean sslEnabled;
    private final int maxConnections;
    private final Duration timeout;

    ServerConfig(Builder builder) {
        this.host = builder.host;
        this.port = builder.port;
        this.sslEnabled = builder.sslEnabled;
        this.maxConnections = builder.maxConnections;
        this.timeout = builder.timeout;
    }
}
