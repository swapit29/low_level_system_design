package com.swapit.logger;

import com.swapit.appender.ConsoleAppender;
import com.swapit.appender.LogAppender;
import com.swapit.utility.CommonUtility;

public class Logger {

    private static Logger logger;

    private Logger() {
    }

    LogConfig logConfig;

    public static Logger getLogger() {
        return getLogger(new LogConfig(LogLevel.INFO, new ConsoleAppender()));
    }

    public static Logger getLogger(LogConfig logConfig) {
        logger = getInstance();
        logger.logConfig = logConfig;
        return logger;
    }

    private static Logger getInstance() {
        if (logger == null) {
            return new Logger();
        }
        return logger;
    }

    public void trace(String logInfo) {
        if (isValidPrintableLogLevel(LogLevel.TRACE)) {
            printLogInfo(LogLevel.TRACE, logInfo);
        }
    }

    public void info(String logInfo) {
        if (isValidPrintableLogLevel(LogLevel.INFO)) {
            printLogInfo(LogLevel.INFO, logInfo);
        }
    }

    public void debug(String logInfo) {
        if (isValidPrintableLogLevel(LogLevel.DEBUG)) {
            printLogInfo(LogLevel.DEBUG, logInfo);
        }
    }

    public void warn(String logInfo) {
        if (isValidPrintableLogLevel(LogLevel.WARN)) {
            printLogInfo(LogLevel.WARN, logInfo);
        }
    }

    public void error(String logInfo) {
        if (isValidPrintableLogLevel(LogLevel.ERROR)) {
            printLogInfo(LogLevel.ERROR, logInfo);
        }
    }

    public void fatal(String logInfo) {
        if (isValidPrintableLogLevel(LogLevel.FATAL)) {
            printLogInfo(LogLevel.FATAL, logInfo);
        }
    }

    private boolean isValidPrintableLogLevel(LogLevel logLevel) {
        return logLevel.ordinal() >= logConfig.getLogLevel().ordinal();
    }

    private void printLogInfo(LogLevel logLevel, String logInfo) {
        CommonUtility utility = new CommonUtility();
        String logMessage = utility.getLogMessage(logLevel, logInfo);
        logConfig.getLogAppender().append(logMessage);
    }
}
