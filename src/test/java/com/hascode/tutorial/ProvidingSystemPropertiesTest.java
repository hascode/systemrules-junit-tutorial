package com.hascode.tutorial;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ProvideSystemProperty;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProvidingSystemPropertiesTest {
    @Rule
    public final ProvideSystemProperty provideProperty = new ProvideSystemProperty("xxx", "yyy");

    @Test
    public void _1_shouldProvideProperty() throws Exception {
        assertThat(System.getProperty("xxx"), is("yyy"));
        System.setProperty("xxx", "zzz");
        assertThat(System.getProperty("xxx"), is("zzz"));
    }

    @Test
    public void _2_shouldHaveResettedProperty() throws Exception {
        assertThat(System.getProperty("xxx"), is("yyy"));
    }
}
