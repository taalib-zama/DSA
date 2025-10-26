package designPattern.creational.builder;

import java.time.Duration;

public class Builder {
    String host;
    int port = 80;  // defaults
    boolean sslEnabled = false;
    int maxConnections = 100;
    Duration timeout = Duration.ofSeconds(30);

    public Builder withHost(String host) {
        this.host = host;
        return this;
    }

    public Builder withPort(int port) {
        this.port = port;
        return this;
    }

    public Builder enableSSL(boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
        return this;
    }

    public Builder maxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    public Builder timeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }

    public ServerConfig build() {
        // Optional validation
        if (host == null || host.isEmpty())
            throw new IllegalStateException("Host must be configured");
        return new ServerConfig(this);
    }
}

