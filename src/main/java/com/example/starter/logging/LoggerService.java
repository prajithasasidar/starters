package com.example.starter.logging;

public interface LoggerService {

    void info(String message);
    void error(String message);
    void debug(String message);

}
