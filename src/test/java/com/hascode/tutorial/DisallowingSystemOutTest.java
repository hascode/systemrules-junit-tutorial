package com.hascode.tutorial;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.DisallowWriteToSystemOut;

public class DisallowingSystemOutTest {

    @Rule
    public final DisallowWriteToSystemOut disallowSysoutWrite = new DisallowWriteToSystemOut();

    @Test(expected = AssertionError.class)
    public void shouldFailWhenWritingToSysout() throws Exception {
        System.out.println("i fail");
    }
}
