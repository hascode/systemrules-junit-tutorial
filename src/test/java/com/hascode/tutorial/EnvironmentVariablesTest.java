package com.hascode.tutorial;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

public class EnvironmentVariablesTest {
    @Rule
    public final EnvironmentVariables envVars = new EnvironmentVariables();

    @Test
    public void shouldSetAndReadEnvironmentVariables() throws Exception {
        envVars.set("JAVA_HOME", "/tmp");
        assertThat(System.getenv("JAVA_HOME"), equalTo("/tmp"));
    }
}
