package com.sda.solid.lsp.fixed;

public class LspDemoFixedApp {
    public static void main(String[] args) {
        /**
         * Writable logger jest obsłużony i na FileLogger i na ConsoleLogger,
         * w obu przypadkach możemy zapisywać logi
         */
        WritableLogger writableLogger = new FileLogger(); //Liskov ready
        writableLogger.writeLog("aaa");
        writableLogger.writeLog("bbb");
        writableLogger = new ConsoleLogger(); //Liskov ready
        writableLogger.writeLog("ccc");
        writableLogger.writeLog("ddd");

        System.out.println("=====================");
        /**
         * ReadableLogger jest zdefiniowany tylko na FileLogger i tam można go wywołać
         * a na ConsoleLogger nie uda się bo ConsoleLogger nie implementuje tego interfejsu
         */
        ReadableLogger readableLogger = new FileLogger();
        readableLogger.readLog();
        //readableLogger = new ConsoleLogger(); - to się nawet nie będzie pozwalać kompilować

    }
}
