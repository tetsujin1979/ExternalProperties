package com.properties;

import java.io.IOException;
import java.util.Properties;

public class MyProperties {

    private Properties myProperties;

    public MyProperties() {

        myProperties = new Properties();
        try {

    myProperties.load(getClass().getResourceAsStream("/myProps.properties")); 

        } catch (IOException e) {

        	System.err.println("Error loading myProps.properties");
            e.printStackTrace();

        }        

    }

    public String getPropertyValue() {
        return myProperties.getProperty("key");
    }
    
    public static void main(String[] args) {
    	
    	MyProperties myProperties = new MyProperties();
    	System.out.println(myProperties.getPropertyValue());
    			
    }

}