package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {

        try {
            //#2- Load the file into fileInput Stream

            FileInputStream file = new FileInputStream("configuration.properties");

            //#3- Load properties object with the file (configuration.properties)
            properties.load(file);

        } catch (IOException e) {
            System.out.println("File not found in configuration properties.");
        }
    }

    //use the above created logic to create a re-usable static method
    public static String getProperty(String keyWord) {
return properties.getProperty(keyWord);
    }
}

