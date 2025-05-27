package com.swapit.demo;

import com.swapit.appender.ConsoleAppender;
import com.swapit.logger.LogConfig;
import com.swapit.logger.LogLevel;
import com.swapit.logger.Logger;

public class LoggerDemo {

    public static void main(String[] args) {
        Logger log = Logger.getLogger(new LogConfig(LogLevel.WARN, new ConsoleAppender()));
        //Logger log = Logger.getLogger();
        log.info("Info message");
        log.trace("Trace message");
        log.warn("Warn message");
        log.error("Error message");

    }
}
