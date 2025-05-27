package com.swapit.appender;

public class ConsoleAppender implements LogAppender {

    @Override
    public void append(String logMessage) {
        System.out.println(logMessage);
    }
}
