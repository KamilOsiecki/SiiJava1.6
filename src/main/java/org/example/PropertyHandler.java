package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyHandler {

    public static Map<String, String> getProperties(){

        Properties data = FileHandler.loadFile("data.properties");
        Map<String, String> properties = new HashMap<>();
        properties.put("login", data.getProperty("login"));
        properties.put("password", data.getProperty("password"));
        properties.put("title", data.getProperty("title"));
        properties.put("url", data.getProperty("url"));
        properties.put("errorMessage", data.getProperty("errorMessage"));

        return properties;
    }
}