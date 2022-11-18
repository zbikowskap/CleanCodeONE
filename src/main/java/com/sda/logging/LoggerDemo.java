package com.sda.logging;

import org.apache.log4j.Logger;

public class LoggerDemo {

    private final static Logger LOGGER = Logger.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        LOGGER.error("Error message");
        LOGGER.fatal("Fatal message");
        LOGGER.warn("Warning message");
        LOGGER.info("Info message");
        LOGGER.trace("Trace message");
        LOGGER.debug("Debug message");

        if(LOGGER.isDebugEnabled()) {
            LOGGER.info("Jeśli debug to mnie wyświetl");
        }

        if(LOGGER.isTraceEnabled()) {
            LOGGER.info("Lubię programować zgodnie z YOLO");
        }
    }
}
