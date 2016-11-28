package com.hascode.tutorial;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class DisallowingSystemExitTest {

    @Rule
    public final ExpectedSystemExit systemExitRule = ExpectedSystemExit.none();

    @Test
    public void shouldFailWhenCallingSystemExit() throws Exception {
        systemExitRule.expectSystemExitWithStatus(1);
        System.exit(1);
    }
}
