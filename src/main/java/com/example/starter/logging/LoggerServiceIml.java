package com.example.starter.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerServiceIml implements LoggerService {

    private  final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void info(String message) {
        logger.info("custom:: " + message);
    }

    @Override
    public void error(String message) {
        logger.error("custom:: " + message);
    }

    @Override
    public void debug(String message) {
        logger.debug("custom:: " + message);
    }
}
