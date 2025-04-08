package com.example.starter.logging;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "logging")
public class LogProperties {
    private boolean enabled = true;
    private String level = "INFO";

    public boolean isEnabled() {
        return enabled;
    }

    public LogProperties setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public LogProperties setLevel(String level) {
        this.level = level;
        return this;
    }
}
