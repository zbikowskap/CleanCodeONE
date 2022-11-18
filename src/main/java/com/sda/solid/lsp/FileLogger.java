package com.sda.solid.lsp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FileLogger implements Logger {
    List<String> messages;

    public FileLogger() {
        this.messages = new ArrayList<>();
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("Got new message: " + message);
        messages.add(message);
    }

    @Override
    public Collection<String> readMessages() {
        System.out.println("Reading all the logs:");
        return messages;
    }
}
