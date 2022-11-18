package com.sda.solid.ocp.fixed;

public class DatabaseClientLoggerApp {
    public static void main(String[] args) {
        MessageLogger messageLogger = new DatabaseLogger();
        Logger logger = new Logger(messageLogger);

        try {
            logger.log("ccc");
            logger.log("ddd");
        } catch (Exception e) {
            System.out.println("Chociaż tyle");
        }
    }
}
