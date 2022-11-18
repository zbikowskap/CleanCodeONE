package com.sda.solid.lsp.fixed;

public class ConsoleLogger implements WritableLogger {
    @Override
    public void writeLog(String message) {
        System.out.println("Writing new log to console: " + message);
    }
}
