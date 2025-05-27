package com.swapit.logger;

import com.swapit.appender.LogAppender;

public class LogConfig {

    private final LogLevel logLevel;
    private final LogAppender logAppender;

    public LogConfig(LogLevel logLevel, LogAppender logAppender) {
        this.logLevel = logLevel;
        this.logAppender = logAppender;
    }

    public LogAppender getLogAppender() {
        return logAppender;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }
}
