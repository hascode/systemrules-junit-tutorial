package com.hascode.tutorial;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleTimePrinter {
    public void printToStdtOut(String formatPattern) {
        ZonedDateTime zdt = ZonedDateTime.now();
        try {
            System.out.println(zdt.format(DateTimeFormatter.ofPattern(formatPattern)));
        } catch (IllegalArgumentException e) {
            System.err.printf("invalid pattern given: %s, error-message: %s\n", formatPattern, e.getMessage());
        }
    }
}
