package com.sda.solid.lsp;

import java.util.Collection;

public interface Logger {
    void writeMessage(String message);

    Collection<String> readMessages();
}
