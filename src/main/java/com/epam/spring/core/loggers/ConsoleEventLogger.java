package com.epam.spring.core.loggers;

public class ConsoleEventLogger implements EventLogger {
    public void logEvent(String msg) {
        System.out.println(msg);
    }
}
