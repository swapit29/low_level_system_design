package com.swapit.utility;

import com.swapit.logger.LogLevel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonUtility {

    public String getLogMessage(LogLevel logLevel, String logInfo) {
        String SPACE = " ";
        return getTimestamp() + SPACE + logLevel + SPACE + logInfo;
    }

    private String getTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}
