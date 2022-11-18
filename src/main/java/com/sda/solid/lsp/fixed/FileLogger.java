package com.sda.solid.lsp.fixed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FileLogger implements ReadableLogger, WritableLogger {
    List<String> messages;

    public FileLogger() {
        this.messages = new ArrayList<>();
    }

    @Override
    public Collection<String> readLog() {
        System.out.println("Reading it all");
        return messages;
    }

    @Override
    public void writeLog(String message) {
        System.out.println("Writing new message to file: " + message);
        messages.add(message);
    }
}
