package com.sda.solid.ocp;

/**
 * OCP Open - Close Principle
 * czyli otwartość na nowe funkchonalności
 * ale zamknięcie na modyfikację istniejącego kodu
 *
 * czyli piszemy kod tak żeby nowe rzeczy można było dopisać
 * nie dotykając tych już istniejących
 */

public class Logger {
    private LogDestination logDestination;

    public Logger(LogDestination logDestination) {
        this.logDestination = logDestination;
    }

    public void log(String message) throws IllegalArgumentException {
        switch (logDestination) {
            case CONSOLE:
                System.out.println("Writing " + message + " to console");
                break;
            case DB:
                System.out.println("Writing " + message + " to database");
                break;
            /**
             * późniejsze (po wproszadzeniu kodu na produkcję) FILE łamie tutaj zasadę
             * OCP bo powoduje konieczność zmiany istniejącej metody, musimy wciąć się
             * z naszymi zmianami w środek już istniejącego kodu
             */
            case FILE:
                System.out.println("Writing " + message + " to some file");
                break;
            default:
                throw new IllegalArgumentException("Not supported logger type");
        }
    }
}
