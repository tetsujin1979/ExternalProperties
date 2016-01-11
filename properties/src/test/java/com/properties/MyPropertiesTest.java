package com.properties;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.properties.MyProperties;

public class MyPropertiesTest {

	private MyProperties myProperties;

    @Before
    public void setup() {

        myProperties = new MyProperties();

    }

    @Test
    public void testMyProperties() {

        assertNotNull(myProperties.getPropertyValue());

    }

}
