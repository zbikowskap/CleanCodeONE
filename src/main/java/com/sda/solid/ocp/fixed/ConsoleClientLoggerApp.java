package com.sda.solid.ocp.fixed;

public class ConsoleClientLoggerApp {
    public static void main(String[] args) {
        MessageLogger messageLogger = new ConsoleLogger();
        Logger logger = new Logger(messageLogger);

        try {
            logger.log("aaa");
            logger.log("bbb");
        } catch (Exception e) {
            //tzw. Swallowing Exception - przełknięcie wyjątku bez żadnej reakcji
            //NEVER EVER DO IT. NEVER.
        }

    }
}
