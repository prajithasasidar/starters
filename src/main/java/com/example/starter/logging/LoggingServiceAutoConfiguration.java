package com.example.starter.logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConditionalOnProperty(prefix = "logging", name = "enabled", havingValue = "true", matchIfMissing = true)
@EnableConfigurationProperties(LogProperties.class)
public class LoggingServiceAutoConfiguration {

    @Bean
    public LoggerService loggingService(LogProperties logProperties) {
        if (logProperties.isEnabled()) {
            return new LoggerServiceIml();
        }
        return null;
    }
}

