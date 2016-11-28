package com.hascode.tutorial;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ClearSystemProperties;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClearingSystemPropertiesTest {
    @Rule
    public final ClearSystemProperties xxxPropertyCleared = new ClearSystemProperties("xxx");

    @Test
    public void _1_shouldSetProperty() throws Exception {
        assertThat(System.getProperty("xxx"), is(nullValue()));
        System.setProperty("xxx", "yyy");
        assertThat(System.getProperty("xxx"), notNullValue());
    }

    @Test
    public void _2_shouldHaveClearedProperty() {
        assertThat(System.getProperty("xxx"), is(nullValue()));
    }

}
