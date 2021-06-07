package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * we will creat a re-usable method that will be reading from  configuration.reader file
 */
public class ConfigurationReader {
    //encapsulation
    //#1 -Create properties object
    private static Properties properties = new Properties();

    static {


        try {
            //#2 -Load the file into FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //#3- load properties object with the file (configuration.properties
            properties.load(file);

        } catch (IOException e) {

            System.out.println("File not found in configuration properties.");
        }

    }
 //USE THE ABOVE CREATED LOGIC TO CREATE A RE-USABLE  METHOD

 public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
 }
}
