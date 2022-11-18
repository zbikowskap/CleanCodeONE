package com.sda.solid.lsp;

/**
 * Liskov Substitution Principle
 * Zasada podstawiania interfejsów Barbary Liskov
 *
 * Zgodnie z tą zasadą dowolna implementacja interfejsu
 * powinna się zachować w spójny, określony kontraktem sposób
 * czyli jeśli interfejs zakłada zwrot kolekcji to metoda ma zwrócić kolekcję
 * niezależnie od tego z której klasy implementującej interfejs będzie wywołana
 */

import java.util.Collection;

public class ConsoleLogger implements Logger {
    @Override
    public void writeMessage(String message) {
        System.out.println("Printing on console: " + message);
    }

    @Override
    public Collection<String> readMessages() {
        System.out.println("Cannot read from console output (as it's output)");
        return null;
    }
}
