package com.sda.solid.lsp;

public class lspFailRunApp {
    public static void main(String[] args) {
        Logger logger = new FileLogger();

        logger.writeMessage("first message");
        logger.writeMessage("second message");

        System.out.println("Printing all the messages for file logger:");
        logger.readMessages()
                .stream()
                .forEach(System.out::println);

        System.out.println("===========================");
        logger = new ConsoleLogger();
        logger.writeMessage("first console message");
        logger.writeMessage("second console message");

        System.out.println("Printing all the messages for file logger:");
        logger.readMessages()
                .stream()
                .forEach(System.out::println);
    }
}
