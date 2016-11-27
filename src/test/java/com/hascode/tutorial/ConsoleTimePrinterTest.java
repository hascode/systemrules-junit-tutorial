package com.hascode.tutorial;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class ConsoleTimePrinterTest {
    ConsoleTimePrinter underTest = new ConsoleTimePrinter();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Rule
    public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

    @Test
    public void shouldPrintValidFormattedDateToStdOut() {
        underTest.printToStdtOut("yyyy");
        assertThat(systemOutRule.getLog(), equalTo("2016\n"));
    }

    @Test
    public void shouldPrintInValidFormatWarningToStdErr() {
        underTest.printToStdtOut("XXXXXXX");
        assertThat(systemErrRule.getLog(),
                equalTo("invalid pattern given: XXXXXXX, error-message: Too many pattern letters: X\n"));
    }

}
